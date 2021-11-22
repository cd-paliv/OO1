package practica.ejercicio18;

import java.time.LocalDate;

import practica.ejercicio7.Empleado;

public class ContratoPorHoras extends Contrato{

	private Empleado empleado;
	private double valorHora;
	private int horasXMes;
	private LocalDate fin;

	public ContratoPorHoras(LocalDate inicio, Empleado empleado, double valorHora, int horasXMes, LocalDate fin) {
		super(inicio);
		this.empleado = empleado;
		this.valorHora = valorHora;
		this.horasXMes = horasXMes;
		this.fin = fin;
	}

	@Override
	public boolean estaVencido() {
		return fin.isAfter(LocalDate.now());
	}

	@Override
	public double getMontoACobrar() {
		return this.getValorHora() * this.getHorasXMes();
	}

	public double getValorHora() {
		return valorHora;
	}

	public int getHorasXMes() {
		return horasXMes;
	}

	public LocalDate getFin() {
		return fin;
	}
	
	
	
}
