package com.cursojava.notas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotasService {
	ArrayList<Integer> notas=new ArrayList<Integer>();
	public void agregarNota(int nota) {
		notas.add(nota);
	}
	public double notaMedia() {
		return notas.stream()
				.mapToInt(n->n)
				.average()
				.orElse(0);
	}
	public int aprobados() {
		return (int) notas.stream()
                .filter(x -> x >= 5)
                .count();
	}
	
	public int notaMasAlta() {
		return notas.stream()
				.mapToInt(n->n)
				.max()
				.orElse(0);
	}
	public List<Integer> notasSuspensas(){
		return notas.stream()
                .filter(n -> n < 5)
                //.collect(Collectors.toList());
                .toList();//desde Java 15
	}
	
}
