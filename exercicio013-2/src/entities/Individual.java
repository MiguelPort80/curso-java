package entities;

public class Individual extends TaxPayer{
	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	public Individual(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double ani = super.getAnualIncome();
		if(ani < 20000.00) {
			ani = (ani * 15)/100;
			
		}else {
			ani = (ani * 25)/100;
		}
		
		if(this.healthExpenditures > 0) {
			this.healthExpenditures = (this.healthExpenditures * 50)/100;
			ani = ani - this.healthExpenditures;
		}
		
		super.setAnualIncome(ani);
		return ani;
	}
}
