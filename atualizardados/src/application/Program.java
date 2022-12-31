package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("UPDATE seller SET BirthDate = ? WHERE (Id = ?)",Statement.RETURN_GENERATED_KEYS);

            System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
            String nascimento = scanner.nextLine();
            st.setDate(1,new java.sql.Date(sdt.parse(nascimento).getTime()));

            System.out.print("Digite o id a ser mudado: ");
            int indice = scanner.nextInt();
            st.setInt(2,indice);

            int rowsAffected = st.executeUpdate();

            System.out.println("Pronto! Linhas afetadas: " + rowsAffected);

        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
