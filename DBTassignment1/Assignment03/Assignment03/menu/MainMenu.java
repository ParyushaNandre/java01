package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class MainMenu {

	public static int mainMenuOptions(Scanner sc) {
		System.out.println("\n---------> Main Menu <----------");
		System.out.println("1. Admin login");
		System.out.println("2. Student register");
		System.out.println("3. Student Login");
		System.out.println("4. Exit");
		System.out.print("Enter choice : ");
		return sc.nextInt();
		
	}
	
	public static void mainMenu(Scanner sc) {
		int choice;
		while((choice = mainMenuOptions(sc)) != 4) {
			
			switch(choice) {
			
			case 1 :
				System.out.println("You have selected admin login case");
				AdminMenu.adminMenu(sc);
			break;
				
			case 2:
				System.out.println("You have selected student registeration option");
			break;
			
			case 3:
				System.out.println("You have selected student login case");
				StudentMenu.studentMenu(sc);
			break;
				
			default:
				System.out.println("Wrong choice...");
			break;
			}
		}
	}
	
		
	
}
