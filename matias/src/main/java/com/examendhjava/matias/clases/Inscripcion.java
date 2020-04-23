package com.examendhjava.matias.clases;

import java.util.Date;

public class Inscripcion {

	private Alumno alumno;
	private Curso curso;
	private Date fechaInscripcion = new Date();
	
	
	public Inscripcion(Alumno alumno, Curso curso, Date fechaInscripcion) {
		
		this.alumno = alumno;
		this.curso = curso;
		this.fechaInscripcion = fechaInscripcion;
		
	}
	
	
}
