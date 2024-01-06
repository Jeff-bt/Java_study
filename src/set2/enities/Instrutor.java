package set2.enities;

import java.util.HashSet;
import java.util.Set;

public class Instrutor {

	private String name;

	private Set<Curso> cursos = new HashSet<>();

	public Instrutor() {

	}

	public Instrutor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void addCurso(Curso curso) {
		cursos.add(curso);
	}

	public void removeCurso(Curso curso) {
		cursos.remove(curso);
	}

	public Integer totalAlunos() {
		Set<Integer> alunos = new HashSet<>();
		
		for(Curso c : cursos) {
			 c.getAlunos();
			 for(Aluno a : c.getAlunos()) {
				 alunos.add(a.getId());
			 }
		}
		
		return alunos.size();
	}

}
