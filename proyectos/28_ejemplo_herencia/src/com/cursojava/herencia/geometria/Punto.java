package com.cursojava.herencia.geometria;

public class Punto {
	private int x,y;
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void dibujar() {
		System.out.print("x: "+x+","+"y: "+y);
	}
}
