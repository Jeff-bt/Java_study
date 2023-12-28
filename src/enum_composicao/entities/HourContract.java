package enum_composicao.entities;

import java.time.LocalDate;

import enum_composicao.enums.WorkerLevel;

public class HourContract {
	
	LocalDate date;
	Double valuePerHour;
	Integer hours;

	public HourContract() {
		
	}
	
	

	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}



	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return hours * valuePerHour;
	}



	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
	
	
	
	
}
