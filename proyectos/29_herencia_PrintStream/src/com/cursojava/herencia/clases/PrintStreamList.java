package com.cursojava.herencia.clases;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrintStreamList extends PrintStream{
	public PrintStreamList(String dir) throws IOException {
		super(dir);
	}
	public void printList(ArrayList<String> cadenas) {
		for(String cad:cadenas) {
			this.println(cad);
		}
	}
}
