package entities;

public class ImportedProduct extends Product{
	
	private Double customerFee;
	public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customerFee = customsFee;
    }

	@Override
	public String priceTag() {
		String str = String.format("%s $ %.2f (Customs fee: %.2f)", super.getName(), super.getPrice(), this.customerFee);
		return str;
	}
	
	public Double totalPrice() {
		return super.getPrice() + this.customerFee;
	}

	public Double getCustomerFee() {
		return customerFee;
	}

	public void setCustomerFee(Double customerFee) {
		this.customerFee = customerFee;
	}
	
	
}
