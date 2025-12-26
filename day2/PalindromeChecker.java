package day2;

public class PalindromeChecker {

	public static void main(String[] args) {
		String str = "Level";
		str = str.toLowerCase();
		
		int left = 0;
		int right = str.length() - 1;
		
		boolean isPalindrome = true;
		
		while (left < right) {
			
			if (str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
				break;
			}
			
			left++;
			right--;
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
