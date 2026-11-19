package com.cursojava.streams;

import java.util.stream.Stream;

public class Test2 {
	void main() {
		Stream<Integer> st=Stream.of(9,0,11,2,3,7,2,7,9,4,11);
		//¿algún negativo?
		System.out.println(
				st
				.anyMatch(n->n<0)
				);
	}
}
