package com.cursojava.herencia.clases;

import java.io.IOException;
import java.util.ArrayList;

public class UsoPrintStreamList {
	void main() {
		var lista=new ArrayList<String>();
		lista.add("lunes");
		lista.add("martes");
		lista.add("miércoles");
		lista.add("lueves");
		try(var pr=new PrintStreamList("test.txt");){
			pr.printList(lista);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
