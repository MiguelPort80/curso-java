package entities;

import java.util.Scanner;

public class CurrencyConverter {
	private double dolarPrice;
	private double dolares;
	public final int IOF = 6;
	Scanner sc = new Scanner(System.in);
	public double setDolarPrice() {
		System.out.println("what is the dollar price?");
		this.dolarPrice = sc.nextDouble();
		return dolarPrice;
	}
	
	public double getDolarPrice() {
		return this.dolarPrice;
	}

	public double getDolares() {
		return dolares;
	}

	public double setDolares() {
		System.out.println("how many dollars will be brought?");
		this.dolares = sc.nextDouble();
		return dolares;
	}
	
	public double dolarConverter(double dolarPrice, double dolares) {
		double aux = dolarPrice * dolares;
		aux = ((aux * IOF)/100) + aux;
		System.out.println("Amount to paid in reais: " + aux);
		return aux;
	}
	
	
}
