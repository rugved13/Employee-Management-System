package main;

import java.sql.*;

public class MyConnection {
    static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "Bhagat";
        String pass = "B";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            System.out.println("Attach jar file");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection Successful");
        return conn;
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        System.out.println(conn);
    }
}
