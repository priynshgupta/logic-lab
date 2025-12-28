package day3;

import java.util.*;

public class MiniATM {
	
	static Scanner sc = new Scanner(System.in);
	static int pin = 1234;
	static double balance = 0.0;
	
	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("\n--- MINI ATM MENU ---");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Change PIN");
            System.out.println("5) Exit");
            System.out.print("Enter option: ");
            
            int option = sc.nextInt();
            
            if (option <= 0 || option >= 5) {
            	System.out.println("Invalid Option");
            	continue;
            }
            
            switch(option) {
            
            case 1:
            	deposit();
            	break;
            case 2:
            	withdraw();
            	break;
            case 3:
            	printBalace();
            	break;
            case 4:
            	changePin();
            	break;
            case 5:
            	System.out.println("Thank you for using ATM");
            	break;
            }
            if (option == 5) {
            	break;
            }
		}
		
		
	}

	private static void deposit() {
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		
		if (amount <= 0) {
			System.out.println("Invalid Amount");
			return;
		} 
		balance += amount;
		System.out.println("Deposited. Balance: " + balance);
		
	}

	private static void withdraw() {
		System.out.print("Enter your pin: ");
		int enteredPin = sc.nextInt();
		
		if (enteredPin != pin) {
			System.out.println("Incorrect Pin.");
			return;
		}
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		
		if (amount <= 0 || amount > balance) {
			System.out.println("Invalid or Insufficient Balance.");
			return;
		} 
		balance -= amount;
		System.out.println("Current Balance: " + balance);
		
	}

	private static void printBalace() {
		System.out.println("Current Balance: " + balance);
		
	}

	private static void changePin() {
		System.out.println("Enter Current PIN: ");
		int oldPin = sc.nextInt();
		
		if (oldPin != pin) {
			System.out.println("Incorrect Pin");
			return;
		}
		
		System.out.println("Enter new PIN: ");
		int newPin = sc.nextInt();
		
		if (newPin <= 0) {
			System.out.println("Invalid PIN");
			return;
		}
		
		pin = newPin;
		System.out.println("PIN changes Successfully");
	}

}
