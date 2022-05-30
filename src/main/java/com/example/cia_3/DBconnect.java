package com.example.cia_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    public static Connection getConnection() throws SQLException {
        String databaseName ="RAILWAY"; // Database Name
        String databaseUser = "root"; // Database User
        String databasePassword = ""; // Database Password
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false"; // Database URL
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println(connection);
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
