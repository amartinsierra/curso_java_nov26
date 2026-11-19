package com.cursojava.interfaces.pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestOperaciones {
	void main() {
		var oper=new OperacionesColecciones();
		ArrayList<Integer> lista1=new 	ArrayList<Integer>();
		lista1.add(25);lista1.add(11);lista1.add(42);
		oper.mostrarLista(lista1);
		Vector<Integer> lista2=new Vector<Integer>();
		lista2.add(-3);lista2.add(-11);lista2.add(-25);
		oper.mostrarLista(lista2);
		oper.mostrarLista(List.of(60,70,80));
	}
}
