package main;
//import java.lang.*; esto lo incluye java por defecto
public class PruebaMetodos {
	String a; //null
	void main() {
		
		String texto="Cadena de prueba";
		System.out.println("Longitud del texto: "+texto.length());
		System.out.println("En la posición 10 tenemos: "+texto.charAt(10));
		String a1=new String("texto1");
		String a2=new String("texto1");
		System.out.println("Iguales: "+(a1==a2)); //false
		
		String b1="hello";
		String b2="hello";
		System.out.println("Iguales: "+(b1==b2)); //true
		System.out.println(a);
	}
}
