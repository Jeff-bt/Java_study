package enum_composicao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import enum_composicao.entities.Department;
import enum_composicao.entities.HourContract;
import enum_composicao.entities.Worker;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		var ct1 = new HourContract(LocalDate.parse("27/12/2023", dtf) , 2.00, 3);
		var ct2 = new HourContract(LocalDate.parse("27/12/2023", dtf) , 2.00, 4);
		var ct3 = new HourContract(LocalDate.parse("27/12/2023", dtf) , 2.00, 1);
		
		Worker w1 = new Worker("Jeff", "JUNIOR", 0.0, new Department("TI"));
		w1.addContract(ct1);
		w1.addContract(ct2);
		
		
		System.out.println(w1);
		System.out.println();
		System.out.println(w1.income(2023, 12));
		
		
	}

}
