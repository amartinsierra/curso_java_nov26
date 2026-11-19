package com.cursojava.herencia.geometria;

public class Punto3D extends Punto{
	private int z;
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	public Punto3D(int z) {
		this.z=z;
		super(10,10);
	}
	@Override
	public void dibujar() {
		super.dibujar(); //llamada al método original
		System.out.println(", z:"+z);
	}
}
