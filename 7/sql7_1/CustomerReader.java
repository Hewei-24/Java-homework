package sql7_1;

import java.sql.*;

public class CustomerReader {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/mydatabase";
        String user= "root",pwd = "Hw044529.";

        try (Connection conn = DriverManager.getConnection(url, user,pwd);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM customers")) {

            System.out.println("customerID\tname\t\t\tphone");
            System.out.println("-----------------------------------------------");
            while (rs.next()) {
                String customerID = rs.getString("customerID");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                System.out.printf("%-10s\t%-20s\t%s\n", customerID, name, phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}