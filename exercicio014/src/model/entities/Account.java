package model.entities;

import model.exceptions.BalanceException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance = 0.0;
	private Double withdrawLimit;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws BalanceException {
		if(this.balance < amount) {
			throw new BalanceException("Not enough balance");
		}
		
		if(this.withdrawLimit < amount) {
			throw new BalanceException("The amount exceeds withdraw limit");
		}
		
		this.balance -= amount;
	}
	public Account(Integer number, String holder, Double withdrawLimit, Double balance) {
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
		this.balance = balance;
	}
	public Account() {
	}
	
}
