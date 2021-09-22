package practica.ejercicio8;

import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo() {}
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		super();
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public double costoEnBase(double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	public double factorDePotencia() {
		return (this.consumoEnergiaActiva) /
				(Math.sqrt((Math.pow(consumoEnergiaActiva, 2)) + (Math.pow(consumoEnergiaReactiva, 2))));
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
}
