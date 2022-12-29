package application;

import model.entities.AluguelCarro1;
import model.entities.Veiculo1;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program1 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel ");
        System.out.print("Modelo do carro: ");
        String carroModelo = scanner.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(),fmt);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(scanner.nextLine(),fmt);

        AluguelCarro1 aluguel = new AluguelCarro1(inicio,fim,new Veiculo1(carroModelo));

        System.out.print("Entre com o preço por hora: ");
        double precoPorHora = scanner.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        double precoPorDia = scanner.nextDouble();

        RentalService rentalService = new RentalService(precoPorDia,precoPorHora,new BrazilTaxService());

        rentalService.processsarFatura(aluguel);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f",aluguel.getFatura().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f",aluguel.getFatura().getImposto()));
        System.out.println("Pagamento total: " + String.format("%.2f",aluguel.getFatura().getPagamentoTotal()));
        
        scanner.close();
    }
}
