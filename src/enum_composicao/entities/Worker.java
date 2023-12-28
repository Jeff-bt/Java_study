package enum_composicao.entities;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	
	String name;
	String level;
	Double baseSalary;
	
	Department department;
	List<HourContract> contracts = new ArrayList<>();
	
	public Worker(String name, String level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		Double sum = 0.0;
		for(HourContract contract : contracts) {
			sum += contract.totalValue();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "name: " + name 
				+ "level: " + level
				+ String.format("%n")
				+ "baseSalary: " + baseSalary
				+ String.format("%n")
				+ "department: " + department.getName()
				+ String.format("%n")
				+ "contracts: " + contracts;
	}
	
	
	
	
}
