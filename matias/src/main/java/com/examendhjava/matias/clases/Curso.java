package com.examendhjava.matias.clases;

import java.util.ArrayList;

public class Curso {

	private String nombre;
	private Integer codigoCurso;
	private Profesor profesorTitular;
	private Profesor profesorAdjunto;
	private ArrayList<Alumno> inscriptos; 
	private Integer maxAlumnos;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	public Profesor getProfesorTitular() {
		return profesorTitular;
	}
	public void setProfesorTitular(Profesor profesorTitular) {
		this.profesorTitular = profesorTitular;
	}
	
	public Profesor getProfesorAdjunto() {
		return profesorAdjunto;
	}
	public void setProfesorAdjunto(Profesor profesorAdjunto) {
		this.profesorAdjunto = profesorAdjunto;
	}
	
	public ArrayList<Alumno> getInscriptos() {
		return inscriptos;
	}
	public void setInscriptos(ArrayList<Alumno> inscriptos) {
		this.inscriptos = inscriptos;
	}
	
	public Integer getMaxAlumnos() {
		return maxAlumnos;
	}
	public void setMaxAlumnos(Integer maxAlumnos) {
		this.maxAlumnos = maxAlumnos;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codigoCurso == null) {
			if (other.codigoCurso != null)
				return false;
		} else if (!codigoCurso.equals(other.codigoCurso))
			return false;
		return true;
	}
	

	
}
