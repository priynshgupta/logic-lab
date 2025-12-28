package day3;
import java.util.*;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		
		System.out.print("Enter password: ");
		String password = sc.nextLine();
		
		if (isValid(password, username)) {
			System.out.println("Password is VALID");
		} else {
			System.out.println("Password is INVALID");
			System.out.println("Feedback: ");
			System.out.println(feedback(password, username));
		}
		
		sc.close();

	}
	
	private static boolean isValid(String pwd, String user) {
		if (pwd.length() < 8 || pwd.length() > 20) {
			return false;
		}
		
		if (pwd.contains(" ")) {
			return false;
		}
		
		if (pwd.toLowerCase().contains(user.toLowerCase())) {
			return false;
		}
		
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		boolean hasSpeacial = false;
		
		String specials = "!@#$%^&*";
		
		for (int i=0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				hasUpper = true;
			} else if (Character.isLowerCase(ch)) {
				hasLower = true;
			} else if (Character.isDigit(ch)) {
				hasDigit = true;
			} else if (specials.indexOf(ch) != -1) {
				hasSpeacial = true;
			} else {
				continue;
			}
		}
		
		return hasUpper & hasLower && hasDigit && hasSpeacial;
	}
	
	private static String feedback(String pwd, String user) {
		StringBuilder sb = new StringBuilder();
		
		if(pwd.length() < 8 || pwd.length() > 20) {
			sb.append("- Length must be between 8 and 20 characters \n");
		}
		if(pwd.contains("")) {
			sb.append("- Password must not contains spaces. \n");
		}
		if(pwd.toLowerCase().contains(user.toLowerCase())) {
			sb.append("- Avoid using parts of your username \n");
		}
		
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigits = false;
		boolean hasSpeacial = false;
		
        String specials = "!@#$%^&*";
        
        for(int i=0; i < pwd.length(); i++) {
        	char ch = pwd.charAt(i);
        	
        	if(Character.isUpperCase(ch)) {
        		hasUpper = true;
        	} else if (Character.isLowerCase(ch)) {
        		hasLower = true;
        	} else if (Character.isDigit(ch)) {
        		hasDigits = true;
        	} else if (specials.indexOf(ch) != -1) {
        		hasSpeacial = true;
        	}
        }
        
        if(!hasUpper) sb.append("- Add at least a uppercase letter. \n");
        if(!hasLower) sb.append("- Add at least a lowercase letter. \n");
        if(!hasDigits) sb.append("- Add at least one digit. \n");
        if(!hasSpeacial) sb.append("- Add more speacial characters. \n");
		
		
		return sb.toString();
	}

}
