package application;

import java.io.File;
import java.util.Scanner;

public class CreatingDirectoriesWithFile {
    public static void main (String[] args) throws SecurityException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        for (File folder : folders) {
            // folder.delete();
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir(); // cria pasta apartir do path inputado
        System.out.println("Diretório criado com sucesso " + success);
        sc.close();
    }
}