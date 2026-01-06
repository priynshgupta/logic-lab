package day4.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Priyansh", 1000.0);
		acc.deposit(500);
		acc.withdraw(300);
		System.out.println(acc.getBalance());
	}

}
