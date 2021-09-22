package practica.ejercicio8;

import java.time.LocalDate;

public class Factura {

	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario unUsuario;
	
	public Factura() {}
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario unUsuario) {
		super();
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.fecha = LocalDate.now();
		this.unUsuario = unUsuario;
	}

	public double montoTotal() {
		return this.montoEnergiaActiva - this.descuento;
	}
	
	public Usuario usuario() {
		return this.unUsuario;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getDescuento() {
		return descuento;
	}

	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
	
	
}
