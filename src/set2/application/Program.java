package set2.application;

import java.util.Locale;
import java.util.Scanner;

import set2.enities.Aluno;
import set2.enities.Curso;
import set2.enities.Instrutor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Instrutor alex = new Instrutor("Alex");
		
		System.out.print("How many students for course A? ");
		Integer alunosA = sc.nextInt();
		Curso a = new Curso("A", alex);

		for (int x = 0; x < alunosA; x++) {
			a.addAluno(new Aluno(sc.nextInt()));
		}
		
		System.out.print("How many students for course B? ");
		Integer alunosB = sc.nextInt();
		Curso b = new Curso("B", alex);

		for (int x = 0; x < alunosB; x++) {
			b.addAluno(new Aluno(sc.nextInt()));
		}
		
		System.out.print("How many students for course C? ");
		Integer alunosC = sc.nextInt();
		Curso c = new Curso("C", alex);

		for (int x = 0; x < alunosC; x++) {
			c.addAluno(new Aluno(sc.nextInt()));
		}
		
		alex.addCurso(a);
		alex.addCurso(b);
		alex.addCurso(c);
		
		System.out.println("Total students: " + alex.totalAlunos());

		sc.close();
	}

}
