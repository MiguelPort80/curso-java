package entities;

public class Company extends TaxPayer{
	private int numberOfEmployees;

	public Company() {
		super();
	}

	public Company(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double ani = super.getAnualIncome();
		if(this.numberOfEmployees >= 10) {
			ani = (ani * 14)/100;
		}else {
			ani = (ani * 16)/100;
		}
		super.setAnualIncome(ani);
		return ani;
	}
}
