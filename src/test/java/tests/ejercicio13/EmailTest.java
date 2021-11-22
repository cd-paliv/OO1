package tests.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica.ejercicio13.*;

public class EmailTest {

	private Email e1;
	private Email e2;
	
	@BeforeEach
	void setUp() {
		this.e1 = new Email("Consulta", "No entiendo el ejercicio"); //8 y 24
		this.e1.agregarAdjunto(new Archivo("Jorge")); //5
		this.e1.agregarAdjunto(new Archivo("Manuel")); //6
		
		this.e2 = new Email("Reunion", "A las 12:30"); //7 y 11
		this.e2.agregarAdjunto(new Archivo("Pablo")); //5
	}
	
	@Test
	void testTitulo() {
		assertEquals(this.e1.getTitulo(), "Consulta");
		assertEquals(this.e2.getTitulo(), "Reunion");
	}
	
	@Test
	void testCuerpo() {
		assertEquals(this.e1.getCuerpo(), "No entiendo el ejercicio");
		assertTrue(this.e1.contiene("entiendo"));
		assertFalse(this.e1.contiene("Al"));
		
		assertEquals(this.e2.getCuerpo(), "A las 12:30");
		assertTrue(this.e2.contiene("12:30"));
		assertFalse(this.e2.contiene("entiendo"));
	}
	
	@Test
	void testTamaño() {
		assertEquals(43, this.e1.tamanioMail());
		this.e1.agregarAdjunto(new Archivo("Juan"));
		assertEquals(47, this.e1.tamanioMail());
		
		assertEquals(23, this.e2.tamanioMail());
	}
}
