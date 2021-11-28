package parcial2311;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import practica.ejercicio14.DateLapse1;

public class Proyecto {

	private Usuario creador;
	private String titulo;
	private String descripcion;
	private double montoMin;
	private LocalDate fechaLimite;
	private List<Aporte> aportes;
	
	public Proyecto(Usuario creador, String titulo, String descripcion, double montoMin, LocalDate fechaLimite) {
		super();
		this.creador = creador;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.montoMin = montoMin;
		this.fechaLimite = fechaLimite;
		this.aportes = new ArrayList<>();
	}
	
	public void recibirAporte(Aporte aporte) {
		this.aportes.add(aporte);
	}
	
	public String getNombreCreador() {
		return this.creador.getNombre();
	}

	public boolean estaVigente() {
		return this.fechaLimite.isAfter(LocalDate.now());
	}
	
	public boolean estaFinanciado() {
		return this.getMontoMin() <= this.aportes.stream().mapToDouble(a -> a.getMonto()).sum();
	}
	
	public boolean aportesEntreFechas(LocalDate inicio, LocalDate fin) {
		DateLapse1 periodo = new DateLapse1(inicio, fin);
		return (this.aportes.stream().filter(a -> a.estaEntreFechas(periodo)).toList()) != null;
	}
	
	public boolean elCreadorTieneTasaMayorA() {
		return this.creador.obtenerTasaDeAportesDiario() > this.aporteTotalProyecto();
	}
	
	public double aporteTotalProyecto() {
		return this.aportes.stream().mapToDouble(a -> a.getMonto()).sum();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getMontoMin() {
		return montoMin;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}
	
	
	
}
