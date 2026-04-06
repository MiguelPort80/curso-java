package entities;

import java.util.ArrayList;

public class OrdemItem {
	private int quantity;
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private ArrayList<Product> products = new ArrayList<>();
	
	public double subTotal() {
		double aux = 0;
		
		for (Product product : products) {
			aux = quantity * product.getPrice();
		}
		
		return aux;
	}
	
	public void addItem(Product p) {
		products.add(p);
	}
	public void removeItem(Product p) {
		products.remove(p);
	}

	@Override
	public String toString() {
		return "OrdemItem [quantity=" + quantity + ", products=" + products + "]";
	}
}
