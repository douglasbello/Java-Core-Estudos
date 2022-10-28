package application;

import java.util.Scanner;
import java.util.Locale;
import entities.TestesEntities;

public class Teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o numero de produtos: ");
		int n = input.nextInt();
		TestesEntities arranjo[] = new TestesEntities[n];
		for (int i=0; i<arranjo.length; i++) {
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			arranjo[i] = new TestesEntities(name,price);
		}
		double sum = 0.0;
		for (int i=0; i<arranjo.length; i++) {
			sum += arranjo[i].getPrice();
		}
		double avg = sum / n;
		System.out.printf("Average price: %.2f",avg);
		input.close();
	}
}