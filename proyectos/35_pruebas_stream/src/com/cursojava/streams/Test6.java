package com.cursojava.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
	void main() {
		Stream<Integer> st=Stream.of(9,0,11,2,3,7,2,7,9,4,11);
		//lista con los enteros pares sin duplicar
		List<Integer> resultado;
		resultado=st
				.filter(n->n%2==0)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(resultado);
	}
}
