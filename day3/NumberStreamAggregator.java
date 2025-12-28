package day3;
import java.util.*;

public class NumberStreamAggregator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[10];
		int size = 0;
		
		System.out.println("Enter numbers (-999 to stop): ");
		
		while(true) {
			
			if (!sc.hasNextInt()) {
				sc.next();
				continue;
			}
			
			int num = sc.nextInt();
			
			if (num == -999) {
				break;
			}
			
			if (size == data.length) {
				data = Arrays.copyOf(data, data.length * 2);
			}
			
			data[size++] = num;
		}
		
		if (size == 0) {
			System.out.println("No data entered");
			return;
		}
		
		int[] arr = Arrays.copyOf(data, size);
		
		int sum = sum(arr);
		int min = min(arr);
		int max = max(arr);
		double avg = average(arr);
		double median = median(arr);
		int mode = mode(arr);
		
		System.out.println(" Count: " + arr.length + " Sum: " + sum + " Min: " + min + 
				" Max: " + max + " Avg: " + avg + " Median: " + median + " Mode: " + mode);
		
	}

	private static int sum(int[] arr) {
		int s = 0;
		
		for (int x : arr) {
			s += x;
		}
		
		return s;
	}

	private static int min(int[] arr) {
		int m = arr[0];
		
		for (int x : arr) {
			m = Math.min(m, x);
		}
		return m;
	}

	private static int max(int[] arr) {
		int m = 0;
		
		for (int x : arr) {
			m = Math.max(m, x);
		}
		return m;
	}

	private static double average(int[] arr) {
		return (double) sum(arr) / arr.length;
	}

	private static double median(int[] arr) {
		
		int[] copy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copy);
		
		int n = copy.length;
		
		if (n % 2 == 1) {
			return copy[n / 2];
		} else {
			return (copy[n / 2 - 1] + copy[n / 2]) / 2.0;
		}
	}

	private static int mode(int[] arr) {
		int mode = arr[0];
		int maxCount = 0;
		
		for (int i=0; i<arr.length; i++) {
			int count = 0;
			
			for (int j=0; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			
			if (count > maxCount) {
				maxCount = count;
				mode = arr[i];
			}
		}
		return mode;
	}

}
