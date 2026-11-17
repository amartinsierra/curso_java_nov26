package main;

import java.util.Scanner;

public class GestorNotas {
	Scanner scan=new Scanner(System.in);
	
	void main() {
		//realizar un programa que lea las notas de 5 alumnos,
		//y las guarde en un array.
		//Las notas deben estar entre 1 y 10. Si se introduce un número
		//fuera de ese rango, se pedirá que lo vuelva a repetir. Así
		//hasta obtener 5 notas válidas
		//una vez guardadas en el array, indicará: total de aprobados y nota media global
		//y también muestre la nota más alta
		int [] notas=new int[5]; //{0,0,0,0,0}
		cargarNotas(notas);
		System.out.println("Aprobados: "+aprobados(notas));
		System.out.println("Nota media: "+notaMedia(notas));
		System.out.println("La nota más alta es: "+notaMaxima(notas));
		
	}	
	
	void cargarNotas(int[] notas) {
		int totalValidas=0;
		int nota;
		while(totalValidas<5) {
			System.out.println("Introduce nota");
			nota=scan.nextInt();
			if(nota>=1&&nota<=10) {
				notas[totalValidas]=nota;
				totalValidas++;
			}else {
				System.out.println("La nota no es válida!, debe estar entre 1 y 10");
			}
		}
	}
	
	int aprobados(int[] notas) {
		int aprobados=0;
		for(int nota:notas) {
			if(nota>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	double notaMedia(int[] notas) {
		double suma=0;
		for(int nota:notas) {
			suma+=nota;
		}
		return suma/notas.length;
	}
	int notaMaxima(int[] notas) {
        int notaMaxima = notas[0];
        for (int nota : notas) {
            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
        }
        return notaMaxima;
    }
}
