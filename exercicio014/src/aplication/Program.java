package aplication;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BalanceException;

public class Program {

	public static void main(String[] args) {
		try {
			Integer number;
			String name;
			Double balance;
			Double withdrawLimit;
			
			Scanner sc = new Scanner(System.in);
			IO.println("Enter account data");
			IO.print("Number:");
			number = sc.nextInt();
			IO.print("Holder:");
			name = sc.next();
			IO.print("Initial balance:");
			balance = sc.nextDouble();
			IO.print("Withdraw Limit:");
			withdrawLimit = sc.nextDouble();
			
			Account ac = new Account(number, name, withdrawLimit, balance);
			IO.print("Deposit a value:");
			ac.deposit(sc.nextDouble());
			
			IO.print("Withdraw a value:");
			ac.withdraw(sc.nextDouble());
		}catch(BalanceException e) {
			IO.println(e.getMessage());
		}
		
	}

}
