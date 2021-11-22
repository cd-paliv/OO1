package tests.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica.ejercicio13.*;

public class ClienteDeCorreoTest {

	private Archivo archivo;
	private Email email, email2;
	private Carpeta carpeta, carpeta2;
	private ClienteDeCorreo cliente;

	@BeforeEach
	void setUp() throws Exception {
		this.carpeta = new Carpeta("Destacados");
		this.carpeta2 = new Carpeta("Recibidos");
		this.email = new Email("Saludo", "Hola");
		this.email2 = new Email("Saludo2", "Hola2");
		this.archivo = new Archivo("File");
		this.cliente = new ClienteDeCorreo();
		
		this.email.agregarAdjunto(archivo);
		this.carpeta.agregarMail(email);
		this.carpeta.agregarMail(email2);
		
		this.cliente.agregarCarpeta(carpeta);
		this.cliente.agregarCarpeta(carpeta2);
	}

	@Test
	void moverTest() {
		this.cliente.mover(email, carpeta, carpeta2);
		assertEquals(1, this.carpeta.getEmails().size());
		assertEquals(1, this.carpeta2.getEmails().size());
	}
	
	@Test
	void buscarTest() {
		assertEquals(this.email2, this.cliente.buscar("Hola2"));
		assertNull(this.cliente.buscar("olaH"));	
	}
	
	@Test
	void espacioOcupadoTest() {
		assertEquals(26, this.cliente.espacioOcupado());
		
	}
}
