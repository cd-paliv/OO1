package practica.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public double valorActual() {
		long cantidadDias = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now()); //calculo la cantidad de días
		return this.getMontoDepositado() + (this.getMontoDepositado() * this.getPorcentajeDeInteresDiario() / 100) * cantidadDias;
	}

	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	
	public double getMontoDepositado() {
		return montoDepositado;
	}
	
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	
}
