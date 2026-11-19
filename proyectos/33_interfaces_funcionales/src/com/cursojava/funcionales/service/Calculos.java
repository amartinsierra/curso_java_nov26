package com.cursojava.funcionales.service;

import java.util.List;

public class Calculos {
	/*
	//método que reciba una lista de enteros
	//y muestre los pares
	public void mostrarPares(List<Integer> numeros) {
		for(Integer n:numeros) {
			if(n%2==0) {
				System.out.println(n);
			}
		}
	}
	//método que reciba una lista y muestre los positivos
	public void mostrarPositivos(List<Integer> numeros) {
		for(Integer n:numeros) {
			if(n>=0) {
				System.out.println(n);
			}
		}
	}
	*/
	public void mostrarCondicion(List<Integer> numeros,Criterio criterio) {
		for(Integer n:numeros) {
			if(criterio.comprobar(n)) {
				System.out.println(n);
			}
		}
	}
	
}
