package com.cursojava.funcionales.service;

import java.util.List;

public class TestCalculos {
	void main() {
		Calculos calc=new Calculos();
		//calc.mostrarPares(List.of(2,9,6,7,4));
		//mostrar los apres
		calc.mostrarCondicion(List.of(2,9,6,7,4), new CriterioPares());
		//mostrar positivos
		calc.mostrarCondicion(List.of(2,-9,6,-7,4), new CriterioPositivos());
	}
}

class CriterioPares implements Criterio{

	@Override
	public boolean comprobar(Integer num) {
		return num%2==0;
	}
	
}
class CriterioPositivos implements Criterio{

	@Override
	public boolean comprobar(Integer num) {
		return num>=0;
	}
	
}
