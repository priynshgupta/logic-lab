package day3;

import java.util.*;


public class CommandLineGradebook {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number of Students: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[n];
		int[] grades = new int[n];
		
		//Input Students
		for (int i=0; i<n; i++) {
			System.out.println("Enter the number of Students " + (i + 1) + ": ");
			names[i] = sc.nextLine();
			
			System.out.println("Enter the grades(0-100): ");
			grades[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int choice;
		
		do {
			System.out.println("\n--- GRADEBOOK MENU ---");
            System.out.println("1. Print All");
            System.out.println("2. Print Topper");
            System.out.println("3. Class Average");
            System.out.println("4. Search by Name");
            System.out.println("5. Curve Grades (+5)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
			case 1:
				printAll(names, grades);
				break;
			case 2:
				printTopper(names, grades);
				break;
			case 3:
				printAverage(grades);
				break;
			case 4:
				searchStudent(names, grades);
				break;
			case 5:
				curveGrades(grades);
				break;
			case 6:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Invalid choice choose only from 1 - 6");
			}
			
		} while (choice != 6);
		
	}

	static void printAll(String[] names, int[] grades) {
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i] + " : " + grades[i]);
		}
		
	}

	static void printTopper(String[] names, int[] grades) {
		int maxIndex = 0;
		
		for (int i=0; i < names.length; i++) {
			if (grades[i] > grades[maxIndex]) {
				maxIndex = i;
			}
 		}
		
		System.out.println("Topper " + names[maxIndex] + " with marks " + grades[maxIndex]);
		
	}

	static void printAverage(int[] grades) {
		int sum = 0;
		
		for (int i : grades) {
			sum += i;
		}
		double avg = (double) sum / grades.length;
		System.out.println("Class Average: " + avg);
		
	}

	static void searchStudent(String[] names, int[] grades) {
		System.out.println("Enter the name to search: ");
		String search = sc.nextLine();
		
		boolean found = false;
		
		for (int i=0; i<names.length; i++) {
			if (names[i].equalsIgnoreCase(search)) {
				System.out.println(names[i] + " : " + grades[i]);
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("Student not found.");
		}
		
	}

	static void curveGrades(int[] grades) {
		for (int i=0; i<grades.length; i++) {
			grades[i] += 5;
			if (grades[i] > 100) {
				grades[i] = 100;
			}
		}
		
		System.out.println("Grades curved by +5 (max 100)");
		
	}

}