package com.cursojava.notas.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	String dir="notas.txt";
	public void agregarNota(int nota) {
		try(FileOutputStream fos=new FileOutputStream(dir, true);
				PrintStream out=new PrintStream(fos)){
			out.println(nota);
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public double notaMedia() {
		double suma=0;
		int total=0;
		try(FileReader fr=new FileReader(dir);
				BufferedReader bf=new BufferedReader(fr)){
			String linea;
			while((linea=bf.readLine())!=null) {
				suma+=Integer.parseInt(linea);
				total++;
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return total>0?suma/total:0;
	}
	public int aprobados() {
		int aprobados=0;
		try(FileReader fr=new FileReader(dir);
				BufferedReader bf=new BufferedReader(fr)){
			String linea;
			while((linea=bf.readLine())!=null) {
				if(Integer.parseInt(linea)>=5) {
					aprobados++;
				}
				
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return aprobados;
	}
	
}
