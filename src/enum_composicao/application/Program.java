package enum_composicao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import enum_composicao.entities.HourContract;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		var teste = new HourContract(LocalDate.parse("27/12/2023", dtf) , 1.00, 3);
		
		System.out.println(teste);
		
	}

}
