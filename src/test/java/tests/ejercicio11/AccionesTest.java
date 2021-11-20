package tests.ejercicio11;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import practica.ejercicio11.*;

public class AccionesTest {

	private Acciones inversion1;
	
	@BeforeEach
	public void setUp() {
		this.inversion1 = new Acciones("SpaceX", 1000, 676);
	}

	@Test
	public void testValorActual() {
		assertEquals(676000, this.inversion1.valorActual());
	}
}
