package com.cursojava.tablas.testing;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cursojava.tablas.model.Empleado;
import com.cursojava.tablas.service.EmpleadosService;

class EmpleadosServiceTest {
	EmpleadosService empleadosService;
	@BeforeEach
	void setUp() throws Exception {
		empleadosService=new EmpleadosService();
		empleadosService.altaEmpleado(1, "a",10,"d1");
		empleadosService.altaEmpleado(2, "b",20,"d2");
		empleadosService.altaEmpleado(3, "c",30,"d3");
	}

	@Test
	void testAltaEmpleado() {
		assertFalse(empleadosService.altaEmpleado(3, "d",40,"d4"));
		assertTrue(empleadosService.altaEmpleado(4, "d",40,"d4"));
	}

	@Test
	void testEliminarEmpleado() {
		assertFalse(empleadosService.eliminarEmpleado(5));
		assertTrue(empleadosService.eliminarEmpleado(2));
	}

	@Test
	void testNombres() {
		assertEquals(3,empleadosService.empleados().length);
	}

}
