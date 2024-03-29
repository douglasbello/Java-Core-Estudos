package application;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {
    public static void main (String[] args) {
        method1();

        System.out.println("End of program.");
    }
    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }
    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) { //se voc� tentar acessar uma posi��o que n�o existe no array, esse catch ser� jogado
            System.out.println("Invalid position.");
            e.printStackTrace(); // mostra toda a chamada de m�todos que acarretou na exce��o
        }
        catch (InputMismatchException e) { // se voc� digitar um uma letra ou caractere em int input, esse catch ser� jogado
            System.out.println("Input error.");
        }

        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
