package application;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class ProgramFinally {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally { // bloco finally � executado independetemente de ter ou n�o exce��es
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed.");
        }
    }
}