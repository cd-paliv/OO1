package tests.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica.ejercicio12.*;

public class EsferaTest {

	private Pieza esfera;

	@BeforeEach
	public void setUp() {
		this.esfera = new Esfera("Hierro", "Gris", 7);
	}
	
	@Test
	public void testVolumenDeMaterial() {
		assertEquals(1436.7550402417319, this.esfera.volumen());
	}
	
	@Test
	public void testSuperficieDeMaterial() {
		assertEquals(615.7521601035994, this.esfera.superficie());
	}
}
