package com.cursojava.streams;

import java.util.stream.Stream;

public class Test5 {
	void main() {
		Stream<String> textos=Stream.of("bicicleta","casa","agua","carretera");
		//¿Cual es la longitud media de esos textos?
		System.out.println(
		textos
		.mapToInt(s->s.length()) //IntStream
		.average()
		.orElse(0)
		);
	}
}
