package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContinuacaoProgram2 {
    public static void main (String[] args) {
        String path = "c:\\blocodas\\in.txt";

        // try-with-resources, como a declara��o do bufferreader est� dentro do try, quando o try acaba, ele fecha a instancia��o
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
