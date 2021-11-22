package practica.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {

	private String nombre;
	private String apellido;
	private int cuil;
	private LocalDate fechaN;
	private boolean hijos;
	private boolean conyuge;
	private LocalDate fechaInicio;
	private List<Contrato> contratos;
	
	public Empleado(String nombre, String apellido, int cuil, LocalDate fechaN, boolean hijos, boolean conyuge) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaN = fechaN;
		this.hijos = hijos;
		this.conyuge = conyuge;
		this.fechaInicio = LocalDate.now();
		this.contratos = new ArrayList<>();
	}
	
	public Contrato getContratoActual() {
		this.contratos.sort((f1, f2) -> f1.getFechaInicio().compareTo(f2.getFechaInicio()));
		return contratos.get(contratos.size() - 1);
	}
	
	public boolean compararCUIL(int cuil) {
		return this.getCuil() == cuil;
	}
	
	public List<Contrato> getContratosVencidos() {
		return this.contratos.stream().filter(c -> c.estaVencido()).toList();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getCuil() {
		return cuil;
	}

	public LocalDate getFechaN() {
		return fechaN;
	}

	public boolean tieneHijos() {
		return hijos;
	}

	public boolean tieneConyuge() {
		return conyuge;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	
}
