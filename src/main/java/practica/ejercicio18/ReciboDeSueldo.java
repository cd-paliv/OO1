package practica.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReciboDeSueldo {

	private String nombre;
	private String apellido;
	private int cuil;
	private double antiguedad;
	private LocalDate fecha;
	private double total;
	
	public ReciboDeSueldo(Empleado empleado) {
		super();
		this.nombre = empleado.getNombre();
		this.apellido = empleado.getApellido();
		this.cuil = empleado.getCuil();
		this.antiguedad = empleado.getAntiguedad();
		this.fecha = LocalDate.now();
		this.total = empleado.getContratoActual().getMontoACobrar();
	}
	
	
}
