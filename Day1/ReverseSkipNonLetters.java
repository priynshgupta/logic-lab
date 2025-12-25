package day1;

public class ReverseSkipNonLetters {

	public static void main(String[] args) {
		String str = "a,b$c";
		char[] arr = str.toCharArray();
		
		int l = 0;
		int r = str.length() - 1;
		
		while (l < r) {
			if (!Character.isLetter(arr[l])) {
				l++;
			} else if (!Character.isLetter(arr[r])) {
				r--;
			} else {
				char temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		System.out.println(new String(arr));
	}

}
