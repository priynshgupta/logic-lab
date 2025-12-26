package day2;

import java.util.*;

public class SimpleATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 1000;
		int choice;
		
		do {
			System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
			
            choice = sc.nextInt();
            
            switch (choice) {
            
            case 1:
            	System.out.println("Current Balance: " + balance);
            	break;
            case 2:
            	System.out.println("Enter amount: ");
            	int deposit = sc.nextInt();
            	balance += deposit;
            	System.out.println("New Balace: " + balance);
            	break;
            case 3:
            	System.out.println("Enter Amount: ");
            	int withdraw = sc.nextInt();
            	if (withdraw <= balance) {
            		balance -= withdraw;
            		System.out.println("Remained Balance: " + balance);
            	} else {
            		System.out.println("Insufficient Balance");
            	}
            	break;
            case 4:
            	System.out.println("Thanks for using Priyansh's ATM :-)");
            	break;
            default:
            	System.out.println("Invalid Choice");
            	
            	
            }
		} while (choice != 4);
		

	}

}
