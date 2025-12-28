package day3;

import java.util.*;

public class DayOfWeekCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter day month year: ");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		String day = dayOfWeek(d, m, y);
		
		if (day != null) {
			System.out.println(day);
		}

	}

	private static String dayOfWeek(int d, int m, int y) {
		if (m < 1 || m > 12) {
			System.out.println("Invalid Month");
			return null;
		}
		
		int[] daysInMonth = {
				31, 28, 31, 30, 31, 30,
				31, 31, 30, 31, 30, 31
		};
		
		if (isLeapYear(y)) {
			daysInMonth[1] = 29;
		}
		
		if (d < 1 || d > daysInMonth[m-1]) {
			System.out.println("Invalid Day");
			return null;
		}
		
		//Zeller adjustment
		if (m == 1 || m == 2) {
			m += 12;
			y--;
		}
		
		int K = y % 100; //Year 
		int J = y / 100; //zero based century
		
		int h = (d + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
		
		//Zeller Mapping
		String[] days = {
				"Saturday",
				"Sunday",
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday"
		};
		
		return days[h];
	}

	private static boolean isLeapYear(int y) {
		return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
	}

}
