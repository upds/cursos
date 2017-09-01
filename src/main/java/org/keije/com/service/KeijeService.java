package org.keije.com.service;

import java.io.Serializable;
import java.util.List;

import org.keije.com.domain.Curso;
import org.keije.com.persistence.KeijeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class KeijeService implements Serializable{

	
	@Autowired
	private KeijeMapper keijeMapper;	
	public KeijeMapper getKeijeMapper(){return keijeMapper;}
	
	public void insertCurso(Curso objeto){ keijeMapper.insertCurso(objeto); };
	public Curso getCurso(int id){return keijeMapper.getCurso(id);};
	public List<Curso> getCursos(){return keijeMapper.getCursos();};
	
}
