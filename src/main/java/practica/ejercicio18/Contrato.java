package practica.ejercicio18;

import java.time.LocalDate;

public abstract class Contrato {
	
	private LocalDate inicio;

	public Contrato(LocalDate inicio) {
		super();
		this.inicio = inicio;
	}
	
	public LocalDate getFechaInicio() {
		return inicio;
	}
	
	public abstract boolean estaVencido();
	
	public abstract double getMontoACobrar();
}
