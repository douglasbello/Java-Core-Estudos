package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro1 {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Veiculo1 veiculo;
    private Fatura1 fatura;


    public AluguelCarro1(LocalDateTime inicio, LocalDateTime fim, Veiculo1 veiculo) {
        this.inicio = inicio;
        this.fim = fim;
        this.veiculo = veiculo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Veiculo1 getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo1 veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura1 getFatura() {
        return fatura;
    }

    public void setFatura(Fatura1 fatura) {
        this.fatura = fatura;
    }
}
