package set.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import set.application.entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:/Estudo_de_java/Java_study/src/teste.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<LogEntry>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				System.out.println(fields[0] + " " + fields[1]);
				set.add(new LogEntry(fields[0], Instant.parse(fields[1])));
				line = br.readLine();
			}
			
			System.out.println();
			System.out.println("Total de Users: " + set.size());
			System.out.println("Nome dos Users:");
			for(LogEntry pessoa : set) {
				System.out.println(pessoa.getName());				
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
