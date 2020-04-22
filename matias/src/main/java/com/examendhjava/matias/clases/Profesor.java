package com.examendhjava.matias.clases;

public class Profesor {

	private String nombre;
	private String apellido;
	private Integer antiguedad;
	private Integer codigoProfesor;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getAniguedad() {
		return antiguedad;
	}
	public void setAniguedad(Integer aniguedad) {
		this.antiguedad = aniguedad;
	}
	
	public Integer getCodigoProfesor() {
		return codigoProfesor;
	}
	public void setCodigoProfesor(Integer codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProfesor == null) ? 0 : codigoProfesor.hashCode());
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
		Profesor other = (Profesor) obj;
		if (codigoProfesor == null) {
			if (other.codigoProfesor != null)
				return false;
		} else if (!codigoProfesor.equals(other.codigoProfesor))
			return false;
		return true;
	}
	
	
}
