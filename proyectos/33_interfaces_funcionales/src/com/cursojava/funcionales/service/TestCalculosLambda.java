package com.cursojava.funcionales.service;

import java.util.List;

public class TestCalculosLambda {
	void main() {
		Calculos calc=new Calculos();
		//calc.mostrarPares(List.of(2,9,6,7,4));
		//mostrar los pares
		calc.mostrarCondicion(List.of(2,9,6,7,4), n->n%2==0);
		//mostrar positivos
		calc.mostrarCondicion(List.of(2,-9,6,-7,4), n->n>=0);
	}
}

