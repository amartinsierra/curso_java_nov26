package com.cursojava.basedatos.alumnos.view;

import java.util.List;
import java.util.Scanner;

import com.cursojava.basedatos.alumnos.model.Alumno;
import com.cursojava.basedatos.alumnos.service.AlumnosService;

public class AlumnosView {
	 AlumnosService notasService=new AlumnosService();
	 void main() {
		//bucle que muestra el menú mientras la opcion
		//sea diferente a salir
		int opcion;
		Scanner scan=new Scanner(System.in);
		do {
			//mostrar menú
			menu();

			opcion=Integer.parseInt(scan.nextLine());
			switch(opcion) {
				case 1->guardarAlumno();
	
				case 2->mostrarPorCurso();
	
				case 3->mostrarMedia();
	
				case 4->eliminarPorEmail();	
				case 5->System.out.println("Adios");
			}
			
		}while(opcion!=5);
	}
	
	//método para mostrar el menú
	void menu() {
		System.out.println("1.- Introducir alumno");
		System.out.println("2.- Buscar por curso");
		System.out.println("3.- Mostrar media");
		System.out.println("4.- Eliminar alumno");
		System.out.println("5.- Salir");
	}
	//método para pedir la nota y guardarla
	void guardarAlumno() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce nota: ");
		int nota=Integer.parseInt(scan.nextLine());
		System.out.println("Introduce nombre: ");
		String nombre=scan.nextLine();
		System.out.println("Introduce curso: ");
		String curso=scan.nextLine();
		System.out.println("Introduce email: ");
		String email=scan.nextLine();
		if(notasService.altaAlumno(new Alumno(0,nombre,curso,email,nota))) {
			System.out.println("Alumno añadido!!");
		}else {
			System.out.println("No se puede repetir la misma combinación nombre y curso!!");
		}
		
	}
	//método para mostrar media
	void mostrarPorCurso() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce curso: ");
		String curso=scan.nextLine();
		List<Alumno> alumnos=notasService.alumnosCurso(curso);
		alumnos.forEach(System.out::println);
	}
	//método para mostrar aprobados
	void mostrarMedia() {
		System.out.println("Nota media: "+notasService.notaMedia());
	}
	//método para mostrar todas las notas
	void eliminarPorEmail() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce email: ");
		String email=scan.nextLine();		
		notasService.alumnosCurso(email);
	}
}
