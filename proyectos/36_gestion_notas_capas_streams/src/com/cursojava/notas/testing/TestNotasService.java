package com.cursojava.notas.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cursojava.notas.service.NotasService;

class TestNotasService {
	NotasService notasService=new NotasService();
	@BeforeEach
	void setUp() throws Exception {
		notasService.agregarNota(10);
		notasService.agregarNota(1);
		notasService.agregarNota(5);
	}

	@Test
	void testNotaMedia() {
		assertEquals(5.3, notasService.notaMedia(), 0.1);
	}

	@Test
	void testAprobados() {
		assertEquals(2, notasService.aprobados());
	}

}
