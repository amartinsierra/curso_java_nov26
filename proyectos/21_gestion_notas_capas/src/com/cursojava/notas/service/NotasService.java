package com.cursojava.notas.service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Integer> notas=new ArrayList<Integer>();
	public void agregarNota(int nota) {
		notas.add(nota);
	}
	public double notaMedia() {
		double suma=0;
		for(int n:notas) {
			suma+=n;
		}
		return suma/notas.size();
	}
	public int aprobados() {
		int aprobados=0;
		for(int n:notas) {			
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
}
