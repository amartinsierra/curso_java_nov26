package com.cursojava.alumnos.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import com.cursojava.alumnos.mapper.MapeadorAlumnoFichero;
import com.cursojava.alumnos.model.Alumno;

public class AlumnosService {
	
	Path path=Path.of("alumnos.csv");
	public AlumnosService() {
		//comprobamos si existe el fichero y si no existe se crea		
		if(!Files.exists(path)) {
			try {
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	public boolean guardarAlumno(Alumno alumno) {
		return guardarAlumno(alumno.nombre(), alumno.curso(), alumno.nota());
	}
	public boolean guardarAlumno(String nombre, String curso, int nota) {
		try {
			if(comprobarAlumno(nombre, curso)) {
				return false;
			}else {
				String linea=nombre+","+curso+","+nota;
				Files.writeString(path, linea+"\n", StandardOpenOption.APPEND);
				return true;
			}
		}catch(IOException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public int aprobados() {
		try {
            return (int) Files.lines(path)
                    .map(MapeadorAlumnoFichero::lineToAlumno)
                    .filter(al -> al.nota() >= 5)
                    .count();
        } catch (IOException ex) {
            ex.printStackTrace();
            return 0;
        }
	}
	public double media() {
		try {
			return Files.lines(path)
                    .mapToInt(ln -> MapeadorAlumnoFichero.lineToAlumno(ln).nota())
                    .average()
                    .orElse(0);
		}catch(IOException ex) {
			ex.printStackTrace();
			return 0;
		}		
	}
	public List<Alumno> recuperarAlumnos(){
		try {
	        return Files.lines(path)
	                .map(linea -> MapeadorAlumnoFichero.lineToAlumno(linea))
	                .toList();
	    } catch (IOException excepcion) {
	        excepcion.printStackTrace();
	        return List.of();
	    }		
	}
	private boolean comprobarAlumno(String nombre, String curso) throws IOException {
			return Files.lines(path)
				.map(ln->MapeadorAlumnoFichero.lineToAlumno(ln)) //Stream<Alumno>
				.anyMatch(al->al.curso().equals(curso)&&al.nombre().equals(nombre));
	}
}
