package Exemplo2.entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (getAnuallncome() < 20000.0) {
			return getAnuallncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnuallncome() * 0.25 - healthExpenditures * 0.5;
		}
	}
}