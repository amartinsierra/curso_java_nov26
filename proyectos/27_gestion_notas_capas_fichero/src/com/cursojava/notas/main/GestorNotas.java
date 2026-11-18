package com.cursojava.notas.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.cursojava.notas.service.NotasService;

public class GestorNotas {
	//realizar un programa que lea las notas de alumnos,
	//y las guarde en una lista.
	//Las notas deben estar entre 1 y 10. Si se introduce un número
	//fuera de ese rango, se pedirá que lo vuelva a repetir. 
	//Después de guardar la nota, preguntará si se quiere añadir otra. Si es así (S/N), 
	//se solicitará una nueva y así hasta que diga que no
	//Finalmente, indicará: total de aprobados y nota media global
	NotasService service=new NotasService();
	void main() {
		
		cargarNotas();	
		System.out.println("El total de aprobados es "+service.aprobados());
		System.out.println("Nota media: "+service.notaMedia());
	}
	void cargarNotas(){
		Scanner scan=new Scanner(System.in);
		String respuesta="s";
		int nota;
		while(respuesta.equals("s")) {
			System.out.println("Introduce nota");
			nota=Integer.parseInt(scan.nextLine());
			if(nota>=1&&nota<=10) {
				service.agregarNota(nota);
				System.out.println("¿Desea introducir otra nota?(s/n)");
				respuesta=scan.nextLine();
			}else {
				System.out.println("La nota no es válida!, debe estar entre 1 y 10");
			}
		}
	}
	
	
}
