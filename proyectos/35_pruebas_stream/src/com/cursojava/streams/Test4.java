package com.cursojava.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test4 {
	void main() {
		Stream<Integer> st=Stream.of(9,0,11,2,3,7,2,7,9,4,11);
		//mostrar el más alto de los pares
		System.out.println(
		st
		.filter(n->n%2==0)
		.distinct()
		.max((a,b)->Integer.compare(a, b)) //Optional
		.orElse(-1)
		);
	}
}
