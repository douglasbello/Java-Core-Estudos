package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writters {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Quantas palavras serão escritas no arquivo: ");
//        int n = sc.nextInt();
        String[] lines = {"Good Morning","Good Afternoon","Good night"};

        String path2 = "c:\\blocodas\\novoarquivo.txt";
        String path = "c:\\blocodas\\newfile.txt";
//        String[] linhas = new String[n];
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
//            for (int i = 0; i<linhas.length; i++) {
//                System.out.println("Digite a palavra: ");
//                String linha = sc.nextLine();
//                sc.nextLine();
//                bw.write(linha);
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException asd) {
            asd.printStackTrace();
        }
        sc.close();
    }
}
