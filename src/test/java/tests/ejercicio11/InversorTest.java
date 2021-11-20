package tests.ejercicio11;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import practica.ejercicio11.*;

public class InversorTest {

	private Inversor inversor;
	private Inversion inversion1;
	private Inversion inversion2;
	
	@BeforeEach
	void setUp() {
		this.inversor = new Inversor("PANCRACIO");
		this.inversion1 = new Acciones("Neuralink", 1000, 676);
		this.inversion2 = new PlazoFijo(LocalDate.now(), 1000, 2);
	}

	@Test
	void testAgregarInversion() {
		this.inversor.agregarInversion(inversion1);
		this.inversor.agregarInversion(inversion2);
		assertEquals(2, this.inversor.getInversiones().size());
	}
	
	@Test
	void testValorActual() {
		this.inversor.agregarInversion(inversion1);
		assertEquals(676000, this.inversor.valorActual());
	}
}
