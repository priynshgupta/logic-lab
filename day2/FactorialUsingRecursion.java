package day2;

import java.util.*;


public class FactorialUsingRecursion {

	
	public static int factorial(int n) {
		if (n == 1) return 1;
		return n * factorial(n - 1);
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		System.out.println("Factorial of " + n + " is " + factorial(n));

	}

}
