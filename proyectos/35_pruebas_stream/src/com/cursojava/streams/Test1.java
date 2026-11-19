package com.cursojava.streams;

import java.util.stream.Stream;

public class Test1 {
	void main() {
		Stream<Integer> st=Stream.of(9,0,11,2,3,7,2,7,9,4,11);
		//cuantos números sin duplicar
		st
		.distinct()
		.forEach(System.out::println);
	}
}
