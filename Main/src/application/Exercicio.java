package application;


import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade numeros a serem lidos: ");
		int n = input.nextInt();
		Integer[] vect = new Integer[n];
		int qtdpares = 0;
		for (int i=0;i<vect.length;i++) {
			System.out.println("Digite o numero [" + i + "]");
			vect[i] = input.nextInt();
		}
		System.out.println("Numeros pares: ");
		for (int i=0;i< vect.length;i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				qtdpares++;
			}
		}
		System.out.println();
		System.out.print("TOTAL DE NUMEROS PARES = " );
		System.out.print(qtdpares);

		input.close();
	}
}