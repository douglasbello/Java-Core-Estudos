package application;
import java.io.File;
import java.util.Scanner;

public class InformacoesSobreOCaminhoDoArquivo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // retorna o nome do arquivo
        System.out.println("getParent: " + path.getParent()); //  retorna o SÓ o caminho
        System.out.println("getPath: " + path.getPath()); // retorna o caminho E o nome do arquivo

        sc.close();
    }
}
