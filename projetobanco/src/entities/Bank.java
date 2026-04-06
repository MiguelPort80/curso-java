package entities;

public class Bank {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Bank() {
		
	}
	
	public Bank(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance += accountBalance;
	}
    
	public void withdraw(double value) {
		this.accountBalance -= value;
	}
	
	@Override
	public String toString() {
		String data = String.format("Account %s, Holder: %s, Balance: %s", this.accountNumber, this.accountHolder, this.accountBalance);
		return data;
	}
}
