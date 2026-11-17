package main;

import java.util.ArrayList;

public class PruebasListas {
	void main() {
		ArrayList<Integer> numeros=new ArrayList<>();
		numeros.add(120);
		numeros.add(50);
		numeros.add(0,45);
		numeros.remove(2);
		for(Integer n:numeros) {
			System.out.println(n);
		}
		
	}
}
