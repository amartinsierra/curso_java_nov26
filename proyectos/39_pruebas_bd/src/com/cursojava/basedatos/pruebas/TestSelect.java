package com.cursojava.basedatos.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect {
	private final String CADENA="jdbc:mysql://localhost:3307/alumnoscursos";
	private final String USER="root";
	private final String PASS="root";	
	void main() {
		try(Connection con=DriverManager.getConnection(CADENA, USER, PASS);){
			String sql="select nombre from alumnos";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("nombre"));
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}
