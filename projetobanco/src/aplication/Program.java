package aplication;

import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		IO.println("Enter account holder: ");
		String name = sc.next();
		
		IO.println("Is there a initial deposit:(y/n)");
		String isaDeposit = sc.next();
		
		Bank bk = new Bank();
		
		if(isaDeposit.contains("y")) {
			IO.println("Enter initial deposit value");
			double deposit = sc.nextDouble();
			bk.setAccountBalance(deposit);
		}
		
		bk.setAccountHolder(name);
		bk.setAccountNumber(number);

		IO.println(bk);
	}

}
