package aplication;

import entities.CurrencyConverter;

public class Program {
	public static void main(String args[]) {
		CurrencyConverter dol = new CurrencyConverter();
		double dolarPrice = dol.setDolarPrice();
		double dolares = dol.setDolares();
		dol.dolarConverter(dolarPrice, dolares);
	}
}
