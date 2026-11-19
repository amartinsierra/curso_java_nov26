package com.cursojava.alumnos.view;

import java.util.Scanner;

import com.cursojava.alumnos.model.Alumno;
import com.cursojava.alumnos.service.AlumnosService;

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
	
				case 2->totalAprobados();
	
				case 3->mostrarMedia();
	
				case 4->mostrarAlumnos();	
				case 5->System.out.println("Adios");
			}
			
		}while(opcion!=5);
	}
	
	//método para mostrar el menú
	void menu() {
		System.out.println("1.- Introducir alumno");
		System.out.println("2.- Total aprobados");
		System.out.println("3.- Mostrar media");
		System.out.println("4.- Mostrar alumnos");
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
		if(notasService.guardarAlumno(new Alumno(nombre,curso,nota))) {
			System.out.println("Alumno añadido!!");
		}else {
			System.out.println("No se puede repetir la misma combinación nombre y curso!!");
		}
		
	}
	//método para mostrar media
	void mostrarMedia() {
		System.out.println("Media: "+notasService.media());
	}
	//método para mostrar aprobados
	void totalAprobados() {
		System.out.println("Aprobados: "+notasService.aprobados());
	}
	//método para mostrar todas las notas
	void mostrarAlumnos() {
		for(Alumno a:notasService.recuperarAlumnos()) {
			//System.out.println("Nombre: "+a.nombre()+" Curso: "+a.curso()+" Nota:"+a.nota());
			System.out.println(a);
		}		
	}
}
