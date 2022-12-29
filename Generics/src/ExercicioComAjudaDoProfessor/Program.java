package ExercicioComAjudaDoProfessor;

import ExercicioComAjudaDoProfessor.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];

                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username,moment));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException io) {
            System.out.println("Error " + io.getMessage());
        }
        scanner.close();
    }
}
