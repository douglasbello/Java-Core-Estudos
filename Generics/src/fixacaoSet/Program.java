package fixacaoSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos no curso A? ");
        int x = scanner.nextInt();
        Set<Integer> cursoA = new HashSet<>(x);

        for (int i = 0; i < x; i++) {
            int aluno = scanner.nextInt();
            cursoA.add(aluno);
        }

        System.out.print("Quantos alunos no curso B? ");
        int y = scanner.nextInt();
        Set<Integer> cursoB = new HashSet<>(y);

        for (int i = 0; i < y; i++) {
            int aluno = scanner.nextInt();
            cursoB.add(aluno);
        }

        System.out.print("Quantos alunos no curso C? ");
        int z = scanner.nextInt();
        Set<Integer> cursoC = new HashSet<>(y);
        for (int i = 0; i < z; i++) {
            int aluno = scanner.nextInt();
            cursoC.add(aluno);
        }

        Set<Integer> total = new HashSet<>(cursoA);
        total.addAll(cursoB);
        total.addAll(cursoC);

        System.out.println("Total estudantes: " + total.size());
    }
}
