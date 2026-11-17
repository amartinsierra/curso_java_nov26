package main;

import java.util.Scanner;

public class ContarVocales {
	void main() {
		//solicitamos al usuario la introudcción de un texto
		//a continuación, mostramos el total de vocales que tiene ese texto
		String texto;
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		texto=scan.nextLine();
		texto=texto.toLowerCase();
		int vocales=0;
		for(int i=0;i<texto.length();i++) {
			switch(texto.charAt(i)) {
				case 'a','e','i','o','u':
					vocales++;
			}
		}
		System.out.println("Total vocales: "+vocales);
	}
}
