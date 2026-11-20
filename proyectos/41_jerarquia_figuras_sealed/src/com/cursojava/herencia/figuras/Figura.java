package com.cursojava.herencia.figuras;

public sealed abstract class Figura permits Circulo,Triangulo{
	private String color;
	public Figura(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double superficie();
}
