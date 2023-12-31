package heranca_polimorfismo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.entities.Company;
import heranca_polimorfismo.entities.Individual;
import heranca_polimorfismo.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxPa = sc.nextInt();
		
		for(int i = 1; i <= taxPa; i++ ) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0); 
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(c == 'i') {
				System.out.print("Health expenditures: ");
				Double healthEx = sc.nextDouble();
				Individual in = new Individual(name, anualIncome, healthEx);
				taxPayers.add(in);
			} else {
				System.out.print("Number of employees: ");
				int numberEmp = sc.nextInt();
				Company co = new Company(name, anualIncome, numberEmp);
				taxPayers.add(co);
			}
				
		}
		
		System.out.println("\nTAXES PAID:");
		Double totalTaxes = 0.0;
		
		for(TaxPayer tp : taxPayers) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
			totalTaxes += tp.tax();
		}
		
		System.out.println("\nTOTAL TAXES: $" + totalTaxes);
		
		
		
		sc.close();
	}

}
