package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDbConnection {
	public static void main(String[] args) {
        String jdbcUrl = "jdbc:h2:file:~/datav101/testdb101";
        String user = "user";
        String pass = "user";
        System.out.println("Connecting to DB: " + jdbcUrl);

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection success");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection unsuccessful");
        }
    }
}
