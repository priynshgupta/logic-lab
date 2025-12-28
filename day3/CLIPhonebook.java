package day3;
import java.util.*;

public class CLIPhonebook {
	
	static final int MAX = 100;
	static String[] names = new String[MAX];
	static String[] phones = new String[MAX];
	static int size = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Welcome to CLI Phonebook");
			String line = sc.nextLine().trim();
			
			if (line.length() == 0) {
				continue;
			}
			
			String[] parts = line.split(" ");
			String command = parts[0].toUpperCase();
			
			switch (command) {
			case "ADD": 
				add(parts);
				break;
			case "DEL":
				del(parts);
				break;
			case "FIND":
				find(parts);
				break;
			case "LIST":
				list(parts);
				break;
			case "EXIT":
				System.out.println("Goodbye. ");
				return;
			default:
				System.out.println("Unknown Command");
			}
			
		}
		

	}

	private static void add(String[] parts) {
		if (parts.length != 3) {
			System.out.println("Invalid ADD Command");
			return;
		}
		
		if (size == MAX) {
			System.out.println("Phonebook is Full");
			return;
		}
		
		String name = parts[1];
		String phone = parts[2];
		
		if (!isValidPhone(phone)) {
			System.out.println("Invalid phone number");
			return;
		}
		
		names[size] = name;
		phones[size] = phone;
		size++;
		
	}

	private static void del(String[] parts) {
		if (parts.length != 2) {
			System.out.println("Invalid DEL Command. ");
			return;
		}
		
		String target = parts[1].toLowerCase();
		
		for (int i=0; i<size; i++) {
			if (names[i].toLowerCase().equals(target)) {
				
				for(int j=0; j<size-1; j++) {
					names[j] = names[j + 1];
					phones[j] = phones[j + 1];
				}
				
				size--;
				return;
			}
		}
		
		System.out.println("Contact not found. ");
		
	}

	private static void find(String[] parts) {
		if (parts.length != 2) {
			System.out.println("Invalid FIND command. ");
			return;
		}
		
		String sub = parts[1].toLowerCase();
		boolean found = false;
		
		for (int i=0; i<size; i++) {
			if (names[i].toLowerCase().contains(sub)) {
				System.out.println("Found: " + names[i] + "(" + phones[i] + ")");
				found = true;
			}
		}
		
		if (!found) {
			System.out.println("No match found. ");
		}
		
	}

	private static void list(String[] parts) {
		if (size == 0) {
			System.out.println("List is empty.");
			return;
		}
		
		for (int i=0; i<size; i++) {
			System.out.println(names[i] + "(" + phones[i] + ")");
			if (i < size - 1) System.out.println(", ");
		}
		System.out.println();
	}
	
	private static boolean isValidPhone(String phone) {
		if (phone.length() != 10) return false;
		
		for (int i=0; i<phone.length(); i++) {
			if (!Character.isDigit(phone.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
