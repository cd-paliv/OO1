package tests.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica.ejercicio9.*;

public class CuentaTest {

	private CuentaCorriente cc, ccPrueba;
	private CajaDeAhorro ca;
	
	@BeforeEach
	public void setUp() {
		this.cc = new CuentaCorriente();
		this.ccPrueba = new CuentaCorriente();
		this.ca = new CajaDeAhorro();
	}
	
	@Test
	public void testConstructor() {
		//this.cc = new CuentaCorriente();
		assertEquals(0, this.cc.getSaldo());
		//this.ca = new CajaDeAhorro();
		assertEquals(0, this.ca.getSaldo());
	}
	
	@Test
	public void testDespositar() {
		assertEquals(0, this.cc.getSaldo());
		this.cc.depositar(200);
		assertEquals(200, this.cc.getSaldo());
		
		assertEquals(0, this.ca.getSaldo());
		this.ca.depositar(200);
		assertEquals(200, this.ca.getSaldo());
		this.ca.depositar(300);
		assertEquals(500, this.ca.getSaldo());
	}
	
	@Test
	public void testDescubierto() {
		this.cc.setDescubierto(-10d);
		assertEquals(-10d, this.cc.getDescubierto());
		
		this.ccPrueba.setDescubierto(-231);
		assertEquals(-231, this.ccPrueba.getDescubierto());
	}
	
	@Test
	public void testExtraer() {
		//CuentaCorriente
		this.cc.depositar(200);
		this.cc.setDescubierto(-10d);
		assertFalse(this.cc.extraer(500));
		assertTrue(this.cc.extraer(50));
		assertEquals(150, this.cc.getSaldo());
		assertTrue(this.cc.extraer(160));
		assertEquals(-10d, this.cc.getSaldo());
		
		//CajaDeAhorro
		this.ca.depositar(500);
		assertTrue(this.ca.extraer(50));
		assertEquals(449, this.ca.getSaldo()); //extrae del método en Cuenta por lo cual no resta el 2%
		this.ca.extraer(50);
		assertEquals(398, this.ca.getSaldo());
		assertFalse(this.ca.extraer(395)); //395 + (395 * 0.02)
		assertEquals(398, this.ca.getSaldo());
	}
	
	@Test
	public void testTransferirACuenta() {
		this.cc.depositar(200);
		assertEquals(200, this.cc.getSaldo());
		assertEquals(0, this.ca.getSaldo());
		assertFalse(this.cc.transferirACuenta(300, ca));
		assertTrue(this.cc.transferirACuenta(100, ca));
		assertEquals(100, this.ca.getSaldo());
	}
}
