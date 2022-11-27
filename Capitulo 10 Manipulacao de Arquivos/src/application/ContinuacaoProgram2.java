package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContinuacaoProgram2 {
    public static void main (String[] args) {
        String path = "c:\\blocodas\\in.txt";

        // try-with-resources, como a declaração do bufferreader está dentro do try, quando o try acaba, ele fecha a instanciação
        // do br ----> br.close();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
