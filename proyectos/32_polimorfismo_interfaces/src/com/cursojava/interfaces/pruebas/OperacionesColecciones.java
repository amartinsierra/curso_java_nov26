package com.cursojava.interfaces.pruebas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperacionesColecciones {
	//hacer un método que reciba una lista de números
	//y si esta vacía, lo diga, y sino que muestre todo su contenido
	
	public void mostrarLista(List<Integer> listaEnteros) {
		if(listaEnteros.isEmpty()) {
			System.out.println("Lista vacía!");
			return;
		}
		for(Integer i:listaEnteros) {
			System.out.println(i);
		}
	}
	
	//hacer un método que reciba una lista de números
	//y devuelva un conjunto con los números pares de esa lista
	public Set<Integer> soloPares(List<Integer> listaEnteros){
        Set<Integer> listaEnterosPares = new HashSet<Integer>();
        for (Integer i:listaEnteros) {
            if(i%2==0){
                listaEnterosPares.add(i);
            }
        }
        return listaEnterosPares;
    }

}
