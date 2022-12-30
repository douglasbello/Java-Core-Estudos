package Exercicio.application;

import Exercicio.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();

            }

            double avg = list.stream().map(Product::getPrice).reduce(0.0,(x,y) -> x + y / list.size()  );

            System.out.printf("Average price: %.2f%n" ,avg);

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names =
                    list.stream().filter(p -> p.getPrice() < avg).map(Product::getName).sorted(comp.reversed()).collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
