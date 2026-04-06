package entities;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	private Double total;

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return this.name + "," + this.price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double calcPrice() {
		return this.total = this.price * this.quantity;
	}
}
