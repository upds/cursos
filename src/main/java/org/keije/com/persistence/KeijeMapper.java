package org.keije.com.persistence;

import java.util.List;

import org.keije.com.domain.Curso;

public interface KeijeMapper {
	
	public void insertCurso(Curso objeto);
	public Curso getCurso(int id);
	public List<Curso> getCursos();
	
}
