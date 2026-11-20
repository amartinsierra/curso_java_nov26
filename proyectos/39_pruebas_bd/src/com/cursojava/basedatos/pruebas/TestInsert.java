package com.cursojava.basedatos.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestInsert {
	private final String CADENA="jdbc:mysql://localhost:3307/alumnoscursos";
	private final String USER="root";
	private final String PASS="root";
	void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre del alumno: ");
		String nombre=sc.nextLine();
		System.out.println("Curso del alumno: ");
		String curso=sc.nextLine();
		System.out.println("Email del alumno: ");
		String email=sc.nextLine();
		System.out.println("Nota del alumno: ");
		double nota=Double.parseDouble(sc.nextLine());
		//acceso a la base de datos
		try(Connection con=DriverManager.getConnection(CADENA, USER, PASS);){
			String sql="insert into alumnos(nombre,curso,email,nota) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, nombre);
			ps.setString(2, curso);
			ps.setString(3, email);
			ps.setDouble(4, nota);
			ps.execute();
			System.out.println("Alumno añadido!");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
}
