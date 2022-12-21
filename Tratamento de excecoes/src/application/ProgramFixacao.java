package application;

import java.util.Scanner;
import model.Account;
import model.exceptions.DomainException;

public class ProgramFixacao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        String holder = sc.nextLine();
        sc.nextLine();
        System.out.println("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();
        Account acc = new Account(number,holder,initialBalance,withdrawLimit);

        try {
            System.out.println("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println(acc);
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }

        sc.close();
    }
}
