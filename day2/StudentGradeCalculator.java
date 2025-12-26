package day2;

import java.util.*;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		System.out.println("Enter Marks of 5 Subjects");
		
		for (int i=1; i <= 5; i++) {
			total += sc.nextInt();
		}
		
		double percentage = total / 5.0;
		
		char grade;
		
		if (percentage >= 90) {
			grade = 'A';
		} else if (percentage >= 75) {
			grade = 'B';
		} else if (percentage >= 60) {
			grade = 'C';
		} else if (percentage >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("Percentage of Student is: " + percentage);
		System.out.println("Grade of Student is: " + grade);
		
		sc.close();
		
	}

}
