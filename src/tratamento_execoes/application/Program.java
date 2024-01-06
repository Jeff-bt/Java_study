package tratamento_execoes.application;

import java.util.Locale;
import java.util.Scanner;

import tratamento_execoes.entities.Account;
import tratamento_execoes.exceptions.ExceedsLimit;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try{
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account ac = new Account(number, name, balance, limit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			ac.withdraw(sc.nextDouble());
			
			System.out.println("New balance: " + ac.getBalance());
		}
		catch (ExceedsLimit e){
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("unexpected error");
		}
		
		finally {
			sc.close();			
		}
	}

}
