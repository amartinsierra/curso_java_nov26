package com.cursojava.basedatos.alumnos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Alumno {
	private int idAlumno;
	private String nombre;
	private String curso;
	private String email;
	private double nota;
}
