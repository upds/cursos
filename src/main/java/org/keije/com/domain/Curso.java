package org.keije.com.domain;

import java.io.Serializable;

public class Curso implements Serializable{

	private static final long serialVersionUID = 399566913104100001L; 
	
	private int id;
	private String nombre;
	private String tipo;
	private String fecha;
	private String horario;
	private int duracion;
	private int cupo;
	private boolean evaluar;

	public Curso() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	public boolean isEvaluar() {
		return evaluar;
	}
	public void setEvaluar(boolean evaluar) {
		this.evaluar = evaluar;
	}
	
	
	

}
