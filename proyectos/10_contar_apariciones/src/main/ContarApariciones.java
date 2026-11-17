package main;

import java.util.Scanner;

public class ContarApariciones {
	void main() {
		int[] codigos= {234,445,345,88,234,556,345,123,88,450};
		//solicita la introducción de un código y nos dice
		//cuantas veces aparece en el array
		var scan = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");		
		int a= scan.nextInt();
		int repeticiones= 0;
		
		/*for (int i= 0; i< codigos.length; i++)
		{
			if (a == codigos[i]) repeticiones = repeticiones + 1;
		}*/
		for(int codigo:codigos) {
			if(codigo==a) {
				repeticiones++;
			}
		}
		
		System.out.println("Repeticiones: " + repeticiones);
	}
}
