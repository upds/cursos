package org.keije.com.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.keije.com.domain.Curso;

@ManagedBean
@RequestScoped
public class CursoBean {
	
	private static List<Curso> lista = new ArrayList<Curso>();
	
	public List<Curso> getCurso()
	{
		return lista;
	}
	
	public void setLista(List<Curso> lista)
	{
		this.lista = lista;
	}
	
	public void listar()
	{
		Curso cur = new Curso();
		cur.setNombre("Liderazgo para Administradores");
		cur.setTipo("Taller");
		cur.setDuracion(72);
		cur.setFecha("03/09/2017");
		cur.setHorario("09:00");
		cur.setCupo(30);
		cur.setEvaluar(false);
		lista.add(cur);
		
		cur = new Curso();
		cur.setNombre("Tips para Sistemas Comtables");
		cur.setTipo("Seminario");
		cur.setDuracion(50);
		cur.setFecha("05/09/2017");
		cur.setHorario("15:00");
		cur.setCupo(20);
		cur.setEvaluar(false);
		lista.add(cur);
		
		cur = new Curso();
		cur.setNombre("Comercio Exterior");
		cur.setTipo("Diplomado");
		cur.setDuracion(60);
		cur.setFecha("12/09/2017");
		cur.setHorario("18:00");
		cur.setCupo(10);
		cur.setEvaluar(true);
		lista.add(cur);
		
		cur = new Curso();
		cur.setNombre("AndroidStudio 2.3.3");
		cur.setTipo("Taller");
		cur.setDuracion(120);
		cur.setFecha("13/09/2017");
		cur.setHorario("7:00");
		cur.setCupo(20);
		cur.setEvaluar(false);
		lista.add(cur);
		
		cur = new Curso();
		cur.setNombre("Diseño Gráfico para Marketing 2.0");
		cur.setTipo("Congreso");
		cur.setDuracion(48);
		cur.setFecha("21/09/2017");
		cur.setHorario("16:00");
		cur.setCupo(15);
		cur.setEvaluar(true);
		lista.add(cur);
	}
	

}
