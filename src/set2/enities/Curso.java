package set2.enities;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	
	private String name;
	private Instrutor instrutor;
	
	private Set<Aluno> alunos = new HashSet<>();
	
	public Curso() {
		
	}

	public Curso(String name, Instrutor instrutor) {
		this.name = name;
		this.instrutor = instrutor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removeAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public Integer totalAlunos() {
		return alunos.size();
	}
	
	
}
