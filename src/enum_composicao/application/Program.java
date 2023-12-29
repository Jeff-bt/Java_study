package enum_composicao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import enum_composicao.entities.Department;
import enum_composicao.entities.HourContract;
import enum_composicao.entities.Worker;
import enum_composicao.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		

		System.out.print("Enter department's name: ");
		String department = sc.next();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker w1 = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int c = sc.nextInt();
		for(int i = 1; i <= c; i++) {
			System.out.println("Enter contract #" + i + " data");
			System.out.print("Data (DD/MM/YYYY) : ");
			LocalDate date = LocalDate.parse(sc.next(), dtf);
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, duration);
			w1.addContract(contract);
		}
		
		System.err.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String dateIncome = sc.next();
		Integer month = Integer.parseInt(dateIncome.substring(0, 2));
		Integer year = Integer.parseInt(dateIncome.substring(3));
	
		System.out.println(w1);
		System.out.printf("Income for %s: %.2f", dateIncome, w1.income(year, month));
		
		sc.close();
	}

}
