package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program01 {

    private static final String URL = "jdbc:mysql://localhost:3306/internship_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Manager";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if (connection != null) {
                System.out.println("Connection is successful");
                connection.close();
            } else {
                System.out.println("Connection failed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
