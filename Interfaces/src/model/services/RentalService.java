package model.services;

import model.entities.AluguelCarro1;
import model.entities.Fatura1;

import java.time.Duration;

public class RentalService {
    private Double precoPorDia;
    private Double precoPorHora;

    private TaxService taxService;

    public RentalService(Double precoPorDia, Double precoPorHora, TaxService taxService) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxService = taxService;
    }

    public void processsarFatura(AluguelCarro1 aluguelCarro1) {
        double minutos = Duration.between(aluguelCarro1.getInicio(),aluguelCarro1.getFim()).toMinutes();
        double horas = minutos / 60.0;

        double pagamentoBasico;
        if (horas <= 12.0) {
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        }
        else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
        }

        double imposto = taxService.tax(pagamentoBasico);

        aluguelCarro1.setFatura(new Fatura1(pagamentoBasico,imposto));
    }
}
