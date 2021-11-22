package tests.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica.ejercicio13.*;

public class CarpetaTest {

	private Carpeta carpeta;
	private Email email, email2;
	private Archivo archivo;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.carpeta = new Carpeta("Destacados");
		this.email = new Email("Saludo", "Hola");
		this.email2 = new Email("Saludo2", "Hola2");
		this.archivo = new Archivo("File");
		this.email.agregarAdjunto(archivo);
		this.carpeta.agregarMail(email2);
		this.carpeta.agregarMail(email);
	}

	@Test
	void buscarTest() {
		assertNull(this.carpeta.buscarMail("olaH"));
		assertEquals(this.email2, this.carpeta.buscarMail("Hola"));
	}
	
	@Test
	void espacioOcupadoTest() {
		assertEquals(26, this.carpeta.tamanioCarpeta());
	}
}
