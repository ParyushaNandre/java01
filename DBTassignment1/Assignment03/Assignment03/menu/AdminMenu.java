package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class AdminMenu {

	public static int adminMenuOptions(Scanner sc) {
		
		System.out.println("--------> Admin Menu <-------");
		System.out.println("1. Creator quiz");
		System.out.println("2. List quizzes");
		System.out.println("3. Logout");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	
	public static void adminMenu(Scanner sc) {
		
		int choice;
		
		while((choice = adminMenuOptions(sc)) != 3) {
			
			switch(choice) {
			
			case 1:
				System.out.println("1. Create quiz");
			break;
			
			case 2:
				System.out.println("2. List quizzes");
			break;
			
			default:
				System.out.println("Wrong choice...");
			break;
			
			}
		}
	}
}
