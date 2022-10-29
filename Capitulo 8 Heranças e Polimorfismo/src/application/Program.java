package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001,"Alex",0.0);
        BusinessAcount bus = new BusinessAcount(1002,"Maria",0.0,500.0);

        // UPCASTING
        //CONVERTER UM OBJETO DA SUBCLASSE PARA SUPERCLASSE
        Account acc1 = bus;
        Account acc2 = new BusinessAcount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Ana",0.0,0.01);

        // DOWNCASTING
        //CONVERTER UM OBJETO DA SUPERCLASSE PARA SUBCLASSE

        BusinessAcount bus1 = (BusinessAcount)acc2;
        bus1.loan(100.0);

        // BusinessAcount bus2 = (BusinessAcount)acc3; ---> vai dar erro por que acc3 não é uma BussinessAccount

        if (acc3 instanceof BusinessAcount) { // verifica se acc3 é  um objeto instanciado de BusinessAcount
            BusinessAcount bus2 = (BusinessAcount)acc3;
            bus2.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) { // verifica se acc3 é  um objeto instanciado de SavingsAccount
            SavingsAccount sav = (SavingsAccount)acc3;
            sav.updateBalance();
            System.out.println("Update");
        }
        // utilização da classe withdraw da superclasse.
        Account acc4 = new Account(1005,"Douglas",1000.0);
        acc4.withdraw(200.0);
        System.out.println(acc4.getBalance());

        // utilização da classe sobrescrita withdraw da subclasse.
        Account acc5 = new SavingsAccount(1002,"José",1000.0,0.1);
        acc5.withdraw(200.0);
        System.out.println(acc5.getBalance());
    }
}
