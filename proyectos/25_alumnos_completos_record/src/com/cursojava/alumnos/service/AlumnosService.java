package com.cursojava.alumnos.service;

import java.util.ArrayList;

import com.cursojava.alumnos.model.Alumno;

public class AlumnosService {
	ArrayList<Alumno> alumnos=new ArrayList<>();
	public boolean guardarAlumno(Alumno alumno) {
		for(Alumno al:alumnos) {
			if(al.nombre().equals(alumno.nombre())&&al.curso().equals(alumno.curso())) {
				return false;
			}
		}
		return alumnos.add(alumno);
	}
	public boolean guardarAlumno(String nombre, String curso, int nota) {
		for(Alumno al:alumnos) {
			if(al.nombre().equals(nombre)&&al.curso().equals(curso)) {
				return false;
			}
		}
		return alumnos.add(new Alumno(nombre,curso,nota));
	}
	public int aprobados() {
		int aprobados=0;
		for(Alumno a:alumnos) {
			if(a.nota()>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	public double media() {
		double suma=0;
		for(Alumno a:alumnos) {
			suma+=a.nota();
		}
		return suma/alumnos.size();
	}
	public ArrayList<Alumno> recuperarAlumnos(){
		return alumnos;
	}
}
