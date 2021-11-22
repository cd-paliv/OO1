package practica.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ContratoDePlanta extends Contrato {

	private Empleado empleado;
	private double sueldo;
	private double montoConyuge;
	private double montoHijos;

	public ContratoDePlanta(LocalDate inicio, Empleado empleado, double sueldo, double montoConyuge,
			double montoHijos) {
		super(inicio);
		this.empleado = empleado;
		this.sueldo = sueldo;
		this.montoConyuge = montoConyuge;
		this.montoHijos = montoHijos;
	}

	@Override
	public boolean estaVencido() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getMontoACobrar() {
		double total=this.sueldo;		
		if(empleado.tieneConyuge()) {
			total+=this.getMontoConyuge();
		}
		if(empleado.tieneHijos()) {
			total+=this.getMontoHijos();
		}
		
		long antiguedad = ChronoUnit.DAYS.between(LocalDate.now(), empleado.getFechaInicio());
		total += (antiguedad >= 5 && antiguedad < 10) ? (total*0.3) : antiguedad < 15 ? (total*0.5) : antiguedad < 20 ? (total*0.7) : total;
		
		return total;
	}

	public double getSueldo() {
		return sueldo;
	}

	public double getMontoConyuge() {
		return montoConyuge;
	}

	public double getMontoHijos() {
		return montoHijos;
	}
	
	
}
