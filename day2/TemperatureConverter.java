package day2;

import java.util.*;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double temp, converted;
		
		while (true) {
			//Intro
			System.out.println("Temperature Converter");
			System.out.println("1. Celsius to Fahrenheit");
			System.out.println("2. Fahrenheit to Celsius");
			System.out.println("3. Exit");
			choice = sc.nextInt();
			
			//Exit
			if(choice == 3) {
				System.out.println("Exiting Temperatire Converter");
				break;
			}
			
			//Cel to Fah
			if (choice == 1) {
				System.out.println("Enter temperature in Celsius: ");
				temp = sc.nextDouble();
				converted = (temp * 9 / 5) + 32;
				System.out.println("Fahrenheit = " + converted);
			}
			
			//Fah to Cel
			if (choice == 2) {
				System.out.println("Enter temperature in Fahrenheit: ");
				temp = sc.nextDouble();
				converted = (temp - 32) * 5 / 9;
				System.out.println("Celsius = " + converted);
			}
			
			else {
				System.out.println("Invalid choice. Please try again.");
			}
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
