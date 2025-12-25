package day1;

public class LetterFrequency {
    public static void main(String[] args) {
        String str = "bab!!";
        int[] frequency = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                frequency[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) ('a' + i) + " = " + frequency[i]);
            }
        }
    }
}
