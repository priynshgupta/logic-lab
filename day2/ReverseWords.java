package day2;

public class ReverseWords {

	public static void main(String[] args) {
		String sentence = "Java is fun";
		
		String[] words = sentence.split(" ");
		
		String result = " ";
		
		for (String word : words) {
			String revWords = "";
			
			for (int i = word.length() - 1; i >= 0; i--) {
				revWords += word.charAt(i);
			}
			
			result += revWords + " ";
			
		}
		
		System.out.println(result.trim());

	}

}
