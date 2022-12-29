package fixacao.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Installment {
    private LocalDate date;
    private double amount;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Installment(LocalDate dueDate, double amount) {
        this.date = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return date;
    }

    public void setDueDate(LocalDate dueDate) {
        this.date = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(fmt) + " - " + String.format("%.2f", amount);
    }
}
