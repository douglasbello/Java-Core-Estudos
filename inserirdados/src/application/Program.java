package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement st = null;

        try {
//            conn = DB.getConnection();
//            st = conn.prepareStatement("INSERT INTO seller (Name,Email,BirthDate,BaseSalary,DepartmentId) VALUES (?," +
//                    "?,?,?,?)");

            conn = DB.getConnection();
//            st = conn.prepareStatement("INSERT INTO seller (Name,Email,BirthDate,BaseSalary,DepartmentId) VALUES (?," +
//                    "?,?,?,?)",Statement.RETURN_GENERATED_KEYS);

            st = conn.prepareStatement("INSERT INTO department (Name) VALUES ('D1'),('D2')",Statement.RETURN_GENERATED_KEYS);

//            System.out.print("Digite o nome do vendedor: ");
//            String vendedorNome = scanner.nextLine();
//            st.setString(1,vendedorNome);
//
//            System.out.print("Digite o email do vendedor: ");
//            String email = scanner.nextLine();
//            st.setString(2,email);
//
//            st.setDate(3,new java.sql.Date(sdf.parse("22/04/1985").getTime()));
//
//            System.out.print("Digite o salário do vendedor: ");
//            double salario = scanner.nextDouble();
//            st.setDouble(4,salario);
//
//            System.out.print("Digite o departamento do vendedor: ");
//            int departamento = scanner.nextInt();
//            st.setInt(5,departamento);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Pronto! Id = " + id);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
