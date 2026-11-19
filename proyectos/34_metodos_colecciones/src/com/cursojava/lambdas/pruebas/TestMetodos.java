package com.cursojava.lambdas.pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestMetodos {
	void main() {
		List<Integer> lista=new ArrayList<>(List.of(6,3,-1,9,11,-2,4));
		//Elimina los negativos de la lista, después convierte
		//cada elemento de la lista en su cuadrado y finalmente lo muestras
		lista.removeIf(n->n<0);
		lista.replaceAll(n->n*n);
		//lista.forEach(n->System.out.println(n));
		lista.forEach(System.out::println);
	}
}
