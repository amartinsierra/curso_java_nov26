package com.cursojava.notas.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NotasService {
	Path path=Path.of("notas.txt");
	public void agregarNota(int nota) {
		try {
			Files.writeString(path, String.valueOf(nota)+"\n", StandardOpenOption.APPEND);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public double notaMedia() {
		try {
			return Files.lines(path) //Stream<String>
					.mapToInt(s->Integer.parseInt(s))
					.average()
					.orElse(0);
		}
				catch(IOException ex) {
					ex.printStackTrace();
					return 0;
				}
	}
	public int aprobados() {
		try {
			return (int)Files.lines(path) //Stream<String>
					.mapToInt(s->Integer.parseInt(s))
					.filter(n->n>=5)
					.count();
		}catch(IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	public List<Integer> obtenerNotas(){
		try {
			return Files.lines(path)
					.map(s->Integer.parseInt(s)) //Stream<Integer>
					.toList();
					
		}catch(IOException ex) {
			ex.printStackTrace();
			return List.of();
		}
	}
		
	
	
}
