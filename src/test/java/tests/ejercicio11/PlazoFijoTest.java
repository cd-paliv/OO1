package tests.ejercicio11;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import practica.ejercicio11.*;

public class PlazoFijoTest {

	private Inversion inversion1;
	
	@BeforeEach
	public void setUp() {
		this.inversion1 = new PlazoFijo(LocalDate.now().minusDays(10), 1000, 2);
	}

	@Test
	public void testValorActual() {
		assertEquals(1200, this.inversion1.valorActual());
	}
}
