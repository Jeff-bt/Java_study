package heranca_polimorfismo.entities;

public class Company extends TaxPayer {
	
	private int numberOfEmploees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int numberOfEmploees) {
		super(name, anualIncome);
		this.numberOfEmploees = numberOfEmploees;
	}


	public int getNumberOfEmploees() {
		return numberOfEmploees;
	}

	public void setNumberOfEmploees(int numberOfEmploees) {
		this.numberOfEmploees = numberOfEmploees;
	}

	@Override
	public Double tax() {
		
		if(getNumberOfEmploees() > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
		
	}
	
}
