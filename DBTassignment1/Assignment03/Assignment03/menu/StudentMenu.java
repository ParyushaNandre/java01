package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class StudentMenu {

	public static int studentMenuOptions(Scanner sc) {
		System.out.println("\n---------> Student Menu <----------");
		System.out.println("1. View Quizzes");
		System.out.println("2. Take quiz");
		System.out.println("3. View Scores");
		System.out.println("4. Logout");
		System.out.print("Enter choice : ");
		return sc.nextInt();
		
	}
	
	public static void studentMenu(Scanner sc) {
		int choice;
		while((choice = studentMenuOptions(sc)) != 4) {
			
			switch(choice) {
			
			case 1 :
				System.out.println("You have selected view quizzes case");
				
			break;
				
			case 2:
				System.out.println("You have selected tale quiz option");
			break;
			
			case 3:
				System.out.println("You have selected view scores");
				
			break;
				
			default:
				System.out.println("Wrong choice...");
			break;
			}
		}
	}
}
