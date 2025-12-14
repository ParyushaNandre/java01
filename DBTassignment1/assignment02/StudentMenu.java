package com.sunbeam;

import java.util.*;

public class StudentMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort by Roll No");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String n = sc.next();

                    System.out.print("Enter Marks: ");
                    double m = sc.nextDouble();

                    list.add(new Student(r, n, m));
                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    System.out.println("\nStudent Details:");
                    for (Student s : list) {
                        System.out.println(s.rollNo + " " + s.name + " " + s.marks);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Student s : list) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Found: " + s.rollNo + " " + s.name + " " + s.marks);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 4:
                    Collections.sort(list, (a, b) -> a.rollNo - b.rollNo);
                    System.out.println("Sorted by Roll No");
                    break;

                case 5:
                    Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
                    System.out.println("Sorted by Name");
                    break;

                case 6:
                    Collections.sort(list, (a, b) -> Double.compare(a.marks, b.marks));
                    System.out.println("Sorted by Marks");
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 7);

        sc.close();
    }
}
