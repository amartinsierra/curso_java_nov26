package com.cursojava.herencia.figuras;

public class TestPolimorfismo {
	void main() {
		Circulo c=new Circulo("Verde",5);
		Triangulo tr=new Triangulo("Marrón",4,7);
		//mostrar el color y la superficie de ambas figuras
		mostrarDatos(c);
		mostrarDatos(tr);
	}
	void mostrarDatos(Figura f) {
		System.out.println("Color de la figura: "+f.getColor());
		System.out.println("Superficie: "+f.superficie());
		String mensajeEspecifico=switch(f) {
			case Circulo c->"El radio es "+c.getRadio();
			case Triangulo tr->"Base: "+tr.getBase()+" Altura: "+tr.getAltura();
			default->"Otra figura";
		};
		System.out.println(mensajeEspecifico);
	}
}
