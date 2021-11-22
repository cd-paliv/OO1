package tests.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import practica.ejercicio13.Archivo;

public class ArchivoTest {
	
	private Archivo a1;
	private Archivo a2;
	//private Archivo a3;
	
	@BeforeEach
	public void setUp() {
		this.a1 = new Archivo("Pablo");
		this.a2 = new Archivo("Manuel");
	}
	
	@Test
	public void testNombre() {
		assertEquals(a1.getNombre(), "Pablo");
		assertEquals(a2.getNombre(), "Manuel");
	}
}
