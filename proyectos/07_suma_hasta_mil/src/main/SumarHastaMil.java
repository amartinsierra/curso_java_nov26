package main;

public class SumarHastaMil {
	//hasta que  número tendremos sumar, empezado por 1, para
	//alcanzar o superar el valor 1000
	//1+2+3+4..+?
	void main() {	
		final int LIMITE=1000;
		int valor = 0;
		int suma = 0;
		
		while(suma < LIMITE) {
			valor++;
			suma += valor;
		}
		
		System.out.println(valor);
		System.out.println(suma);
			
	}
}
