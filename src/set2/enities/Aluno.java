package set2.enities;

import java.util.HashSet;
import java.util.Set;

public class Aluno {
	
	private Integer id;
	
	private Set<Curso> cursos = new HashSet<>();
	
	public Aluno() {
		
	}

	public Aluno(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void addCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void removeCurso(Curso curso) {
		cursos.remove(curso);
	}
	
}
