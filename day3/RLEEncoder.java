package day3;

import java.util.Scanner;

public class RLEEncoder {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n--- RLE MENU ---");
            System.out.println("1) Compress");
            System.out.println("2) Decompress");
            System.out.println("3) Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            if (choice <= 0 || choice > 3) {
                System.out.println("Invalid Choice");
                continue;
            }

            System.out.print("Enter String: ");
            String input = sc.nextLine();

            switch (choice) {

                case 1:
                    if (!isOnlyLetters(input)) {
                        System.out.println("Invalid input for compression");
                        continue;
                    }
                    System.out.println(compress(input));
                    break;

                case 2:
                    if (!isValidEncoded(input)) {
                        System.out.println("Invalid encoded string");
                        continue;
                    }
                    System.out.println(decompress(input));
                    break;
            }
        }
    }

    // Compress string using RLE
    private static String compress(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                continue;
            }

            sb.append(s.charAt(i - 1));
            sb.append(count);
            count = 1;
        }

        // Append last character group
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);

        return sb.toString();
    }

    // Decompress RLE string
    private static String decompress(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!Character.isLetter(ch)) {
                continue;
            }

            int j = i + 1;
            String num = "";

            while (j < s.length() && Character.isDigit(s.charAt(j))) {
                num += s.charAt(j);
                j++;
            }

            int count = Integer.parseInt(num);

            for (int k = 0; k < count; k++) {
                sb.append(ch);
            }

            i = j - 1;
        }

        return sb.toString();
    }

    // Validate encoded string (letter followed by digit(s))
    private static boolean isValidEncoded(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isLetter(s.charAt(i))) {
                return false;
            }

            i++;

            if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
                return false;
            }

            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                i++;
            }

            i--;
        }
        return true;
    }

    // Manual validation: letters only
    private static boolean isOnlyLetters(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
