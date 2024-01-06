package set.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:/Estudo_de_java/Java_study/src/teste.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
		
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
