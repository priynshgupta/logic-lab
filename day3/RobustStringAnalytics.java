package day3;

import java.util.*;

public class RobustStringAnalytics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("Enter the line of text: ");
			input = sc.nextLine();
		} while (input.length() == 0);
		
		int wordCount = 0;
		int sentenceCount = 0;
		int digitCount = 0;
		int letterCount = 0;
		
		String longestWord = "";
		String currentWord = "";
		
		//Loop for Scanning chars
		for (int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			//count sentence
			if (ch == '.' || ch == '!' || ch == '?') {
				sentenceCount++;
			}
			
			//count digit & letters
			if (Character.isDigit(ch)) {
				digitCount++;
			}
			if (Character.isLetter(ch)) {
				letterCount++;
			}
			
			//Build word manually
			if (Character.isLetter(ch)) {
				currentWord += ch;
			} else {
				//word ended
				if (currentWord.length() > 0) {
					wordCount++;
					
					if (currentWord.length() > longestWord.length()) {
						longestWord = currentWord;
					}
					
					currentWord = "";
				}
			}
		}
		
		//Handle last word if end with letter
		if (currentWord.length() > 0) {
			wordCount++;
			if (currentWord.length() > longestWord.length()) {
				longestWord = currentWord;
			}
		}
		
		int[] vowelFreq = countVowels(input);
		
		System.out.println("Words: " + wordCount);
		System.out.println("Sentences: " + sentenceCount);
		System.out.println("Digits: " + digitCount + ", Letters: " + letterCount);
		System.out.println("Longest Word: " + longestWord);
		System.out.println("Vowel Frequencies: ");
		System.out.println("a= " + vowelFreq[0] +
				" e= " + vowelFreq[1] +
				" i= " + vowelFreq[2] +
				" o= " + vowelFreq[3] +
				" u= " + vowelFreq[4]
		);
		
		sc.close();
	}

	static int[] countVowels(String s) {
		int[] vowels = new int[5];
		
		for (int i=0; i<s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			
				switch (ch) {
				case 'a': vowels[0]++;
				case 'e': vowels[1]++;
				case 'i': vowels[2]++;
				case 'o': vowels[3]++;
				case 'u': vowels[4]++;
			}
		}
		return vowels;
	}

}
