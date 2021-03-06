package tests.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica.ejercicio12.*;

public class PrismaRectangularTest {

	private Pieza prisma;
	
	@BeforeEach
	public void setUp() {
		 this.prisma = new PrismaRectangular("Hierro", "Gris", 9, 9, 4);	
	}
	
	@Test
	public void testVolumenDeMaterial() {
		assertEquals(324.0, this.prisma.volumen());
	}
	
	@Test
	public void testSuperficieDeMaterial() {
		assertEquals(306.0, this.prisma.superficie());
	}
}
