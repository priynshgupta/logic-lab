package day2;

import java.util.*;


public class SumEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		
		System.out.println("Enter the Odd & Even Numbers: ");
		
		for (int i=0; i < n; i++) {
			int num = sc.nextInt();
			
			if (num % 2 == 0) {
				evenSum += num;
			} else {
				oddSum += num;
			}
		}
		
		System.out.println("Sum of Even No.: " + evenSum);
		System.out.println("Sum of Odd No.: " + oddSum);
				
		
		sc.close();
	}

}
