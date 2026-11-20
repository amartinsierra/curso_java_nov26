package com.cursojava.herencia.figuras;

public non-sealed class Triangulo extends Figura {
	private int altura,base;
	
	public Triangulo(String color, int altura, int base) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double superficie() {
		return this.altura*this.base/2;
	}

}
