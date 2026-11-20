package com.cursojava.alumnos.mapper;

import com.cursojava.alumnos.model.Alumno;

public class MapeadorAlumnoFichero {
	public static Alumno lineToAlumno(String linea) {
		String [] datosLinea=linea.split(",");
		return new Alumno(datosLinea[0], datosLinea[1], Integer.parseInt(datosLinea[2]));
	}
	public static String alumnoToLine(Alumno alumno) {
		return alumno.nombre()+","+alumno.curso()+","+alumno.nota();
	}
}
