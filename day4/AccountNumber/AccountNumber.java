package day4.AccountNumber;

public class AccountNumber {
	
	private final String digits;

	public AccountNumber(String s) {
		if (isValid(s)) {
			this.digits = s;
		} else {
			System.out.println("Invalid Account Number.");
			this.digits = "000000000000";
		}
	}

	private boolean isValid(String s) {
		if (s == null || s.length() != 12) {
			return false;
		}
		for (int i=0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}

	public String getDigits() {
		return digits;
	}
	

}
