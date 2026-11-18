package com.cursojava.tablas.service;

import java.util.HashMap;

import com.cursojava.tablas.model.Empleado;

public class EmpleadosService {
	private HashMap<Integer,Empleado> empleados=new HashMap<>();
	//si el código ya existe, no se añade
	public boolean altaEmpleado(Integer codigo, String nombre,double salario, String departamento) {
		if(!empleados.containsKey(codigo)) {
			empleados.put(codigo, new Empleado(codigo,nombre,salario,departamento));
			return true;
		}
		return false;
	}
	//elimina el empleado a partir del código
	public boolean eliminarEmpleado(Integer codigo) {
		if(empleados.containsKey(codigo)) {
			empleados.remove(codigo);
			return true;
		}
		return false;
	}
	//devuelve lista de  empleados
	public Empleado[] empleados() {
		Empleado[] resultado=new Empleado[empleados.size()];
		int pos=0;
		for(Empleado n:empleados.values()) {
			resultado[pos]=n;
			pos++;//para pasar a la siguiente posición del array
		}
		return resultado;	
	}
}
