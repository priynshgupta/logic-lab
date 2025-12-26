package day2;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {10, 25, 7, 30, 15};
		
		
		int largest = -1;
		int secondLargest = -1;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];	
			} else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		} 
		System.out.println(secondLargest);
	}

}
