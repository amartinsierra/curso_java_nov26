package com.cursojava.streams;

import java.util.stream.Stream;

public class Test3 {
	void main() {
		Stream<Integer> st=Stream.of(9,0,11,2,3,7,2,7,9,4,11);
		//mostrar los pares, sin repetición
		st
		.filter(n->n%2==0)
		.distinct()
		.forEach(System.out::println);
	}
}
