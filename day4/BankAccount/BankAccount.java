package day4.BankAccount;

public class BankAccount {
	
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		if (balance > 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
		}
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void apply(double fee) {
		if (fee > 0 && fee <= balance) {
			balance -= fee;
		}
	}
	

}
