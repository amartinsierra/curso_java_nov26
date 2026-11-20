package com.cursojava.basedatos.alumnos.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cursojava.basedatos.alumnos.model.Alumno;

public class AlumnosService {
	private final String CADENA="jdbc:mysql://localhost:3307/alumnoscursos";
	private final String USER="root";
	private final String PASS="root";
	public boolean altaAlumno(Alumno alumno) {
		if(comprobarAlumno(alumno.getNombre(), alumno.getCurso())) {
			return false;
		}
		try(Connection con=DriverManager.getConnection(CADENA, USER, PASS);){
            String sql="insert into alumnos(nombre,curso,email,nota) values(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getCurso());
            ps.setString(3, alumno.getEmail());
            ps.setDouble(4, alumno.getNota());
            ps.execute();
            return true;
        }catch(SQLException ex) {
            ex.printStackTrace();
            return false;
        }
	}
	public List<Alumno> alumnosCurso(String curso){
		List<Alumno> alumnos = new ArrayList<Alumno>();
        try(Connection con=DriverManager.getConnection(CADENA, USER, PASS);){
            String sql="select * from alumnos where curso = ?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, curso);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno(
                    rs.getInt("idAlumno"),
                    rs.getString("nombre"),
                    rs.getString("curso"),
                    rs.getString("email"),
                    rs.getDouble("nota")
                );
                alumnos.add(alumno);
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        return alumnos;
	}
	
	public double notaMedia() {
		try(Connection con=DriverManager.getConnection(CADENA, USER, PASS);){
            String sql="select avg(nota) from alumnos";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next() ) {
                return rs.getDouble(1);
            }
            return 0;
        }catch(SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
	}
	
	public void eliminarPorEmail(String email) {
		try(Connection con=DriverManager.getConnection(CADENA, USER, PASS);){
            String sql="delete from alumnos where email = ?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, email);
            ps.execute();
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    
	}
	private boolean comprobarAlumno(String nombre, String curso){
        try(Connection con=DriverManager.getConnection(CADENA, USER, PASS);){
            String sql="select count(*) from alumnos where nombre = ? and curso = ?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, curso);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
            return false;
        }catch(SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
