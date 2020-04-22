package com.examendhjava.matias.clases;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private Integer codigoAlumno;
	
	
	public Alumno(String nombre, String apellido, Integer codigoAlumno ) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoAlumno = codigoAlumno;	
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoAlumno == null) ? 0 : codigoAlumno.hashCode());
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
		Alumno other = (Alumno) obj;
		if (codigoAlumno == null) {
			if (other.codigoAlumno != null)
				return false;
		} else if (!codigoAlumno.equals(other.codigoAlumno))
			return false;
		return true;
	}
	
}
