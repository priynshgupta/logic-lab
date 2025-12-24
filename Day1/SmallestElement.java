package day1;

public class SmallestElement {

	public static void main(String[] args) {

		int[] arr = {10, -3, 25, 7, 0};
		
		int min = arr[0];
		
		for(int i=1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.print(min);

	}

}
