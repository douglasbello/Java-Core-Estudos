import java.util.Arrays;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] arranjo = new int[tamanho];
        for (int i = 0; i<arranjo.length; i++) {
            System.out.println("Digite o elemento [" + i + "] do array");
            arranjo[i] = sc.nextInt();
        }
        System.out.println("Ordem inicial do array: " + Arrays.toString(arranjo));
        int[] ordemInicial = Arrays.copyOf(arranjo,arranjo.length);
        Arrays.sort(arranjo);
        System.out.println("Array em ordem crescente: " + Arrays.toString(arranjo));
        String z = (Arrays.toString(ordemInicial).equals(Arrays.toString(arranjo))) ? "Array fornecido estava em ordem crescente." :
                "Array fornecido não estava em ordem crescente.";
        System.out.println(z);
        sc.close();
    }
}

