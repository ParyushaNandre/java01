package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo2 {
	private static final String URL= "jdbc:mysql://localhost:3306/internship_db ";
	private static final  String Username="root";
	private static final  String password="manager";
	public static Connection getConnection() throws SQLException {
		 return DriverManager.getConnection(URL, Username, password);
	}
	public static void getAllStudents() {
		
		String sql="select  * from Students";
		Connection con;
		try {
			con = getConnection();
			PreparedStatement selectStatement = con.prepareStatement(sql);
			 ResultSet rs =selectStatement.executeQuery();
			 while(rs.next()) {
				 int rollno= rs.getInt(1);
				 String name=rs.getString(2);
				 String email=rs.getString(3);
				 String course=rs.getString(5);
				 System.out.println(rollno+"-"+ name+"-"+ email+"-" +course);
			 }
			 con.close();
			 selectStatement.close();
			 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void  addStudent() {
		String name= "pari";
		String email="nparyusha24@gmail.com";
		String course= "java";
	    String sql="Insert into students(name,email,course) Values(?,?,?)";
	    try {
	    	Connection con= getConnection();
	    	PreparedStatement insertStatement=con.prepareStatement(sql);
	    	insertStatement.setString(1, name);
	    	insertStatement.setString(2, email);
	    	insertStatement.setString(3, course);
	    	insertStatement.executeUpdate();
	        con.close();
	        insertStatement.close();
	        System.out.println("Student is inserted...");
	}
	    catch (SQLException e) {
			
			e.printStackTrace();
		}
	    
		
	}
	public static void updatestudent() {
		
		String name="pari";
		String email="nparyusha@gmail.com";
		String course="mern";
		String sql="update  students set  course=? where email=?";
		try
		{
			Connection con=getConnection();
			PreparedStatement updateStatement =con.prepareStatement(sql);
			updateStatement.setString(1, course);
			updateStatement.setString(2, email);
			updateStatement.executeUpdate();
			con.close();
			updateStatement.close();
			System.out.println("Course updated...");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	public static void  deleteStudent() {
		int rollno=1;
		String sql="Delete from students where rollno=?";
		try
		{
			Connection con=getConnection();
			PreparedStatement deleteStatement=con.prepareStatement(sql);
			deleteStatement.setInt(1, rollno);
			deleteStatement.executeUpdate();
			con.close();
			deleteStatement.close();
			System.out.println("deleted the rollno:");
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[]args) {
		
		deleteStudent();
	}
}
