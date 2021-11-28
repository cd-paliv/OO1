package parcial2311;

import java.time.LocalDate;

import practica.ejercicio14.DateLapse1;

public class Aporte {

	private Proyecto proyectoAAportar;
	private Usuario usuarioQueAporta;
	private double monto;
	private LocalDate fecha;
	
	public Aporte(Proyecto proyectoAAportar, Usuario usuarioQueAporta, double monto) {
		super();
		this.proyectoAAportar = proyectoAAportar;
		this.usuarioQueAporta = usuarioQueAporta;
		this.monto = monto;
		this.fecha = LocalDate.now();
	}

	public double getMonto() {
		return monto;
	}

	
	public boolean estaEntreFechas(DateLapse1 periodo) {
		return periodo.includesDate(this.fecha);
	}
	
	
}
