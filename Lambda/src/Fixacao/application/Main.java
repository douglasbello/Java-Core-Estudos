package Fixacao.application;
import Fixacao.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();

            }
            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();

            List<String> emails =
                    list.stream().filter(s -> s.getSalario() > salario).map(Funcionario::getEmail
            ).sorted().collect(Collectors.toList());

            System.out.println("Email dos funcionários com salário maior que " + salario);
            emails.forEach(System.out::println);


            double avg = list.stream().filter(f -> f.getName().charAt(0) == 'M').map(Funcionario::getSalario).reduce(0.0,
                    (x,y) -> x + y);

            System.out.println("Soma do salário dos funcionários cujo nome começam com a letra 'M'");
            System.out.printf("%.2f%n",avg);



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }




        scanner.close();
    }
}
