package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program02 {
	private static final String URL = "jdbc:mysql://localhost:3306/internship_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Manager";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	public static void getAllStudents() {
		// String sql = "SELECT rollno,name,email,course FROM students";
		String sql = "SELECT * FROM students";
		try {
			Connection connection = getConnection();
			PreparedStatement selectStatement = connection.prepareStatement(sql);
			ResultSet rs = selectStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				int age = rs.getInt(5);
				System.out.println(id + " - " + name + " - " + email + " - " + age);
			}
			connection.close();
			selectStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// insert
	public static void addStudent() {
		String name = "Suresh";
		String email = "suresh@gmail.com";
		String age = "21";

		String sql = "INSERT INTO students(name,email,age) VALUES(?,?,?)";
		try {
			Connection connection = getConnection();
			PreparedStatement insertStatement = connection.prepareStatement(sql);
			insertStatement.setString(1, name);
			insertStatement.setString(2, email);
			insertStatement.setString(3, age);
			insertStatement.executeUpdate();
			connection.close();
			insertStatement.close();
			System.out.println("Student is inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update
	public static void updateStudent() {
        int id=5;
	    String name = "prajwal";
	    String email = "p@gmail.com";
	    int age = 21;

	    String sql = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";

	    try {
	        Connection connection = getConnection();

	        PreparedStatement updateStatement =
	                connection.prepareStatement(sql);

	        updateStatement.setString(1, name);
	        updateStatement.setString(2, email);
	        updateStatement.setInt(3, age);
	        updateStatement.setInt(4, id);
	        updateStatement.executeUpdate();
	    //    int rows = updateStatement.executeUpdate();

	      //  System.out.println(rows + " student updated");
	        System.out.println("Updated");
	        updateStatement.close();
	        connection.close();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	   

	// delete
	public static void deleteStudent() {
		int id=6;
	    String sql="Delete from students where id=?";
	    try {
	        Connection connection=getConnection();
	        PreparedStatement deleteStatement=connection.prepareStatement(sql);
	        deleteStatement.setInt(1, id);
	        deleteStatement.executeUpdate();
	        connection.close();
	        deleteStatement.close();
	        System.out.println("Student deleted");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	

	public static void main(String[] args) {
		// Test the CRUD Operations
//		getAllStudents();
		//addStudent();
		//updateStudent();
		deleteStudent();
	}

}
