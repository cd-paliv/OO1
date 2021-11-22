package parcial111;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import practica.ejercicio14.DateLapse1;

public class Factura {

	private LocalDate fechaFacturacion;
	private LocalDate fechaExportacion;
	private List<Item> itemsAExportar;
	
	public Factura(LocalDate fechaFacturacion, LocalDate fechaExportacion, List<Item> itemsAExportar) {
		super();
		this.fechaFacturacion = fechaFacturacion;
		this.fechaExportacion = fechaExportacion;
		this.itemsAExportar = itemsAExportar;
	}
	
	public double getCostoBasico() {
		return this.itemsAExportar.stream().mapToDouble(i -> i.getCosto()).sum();
	}
	
	public double getCostoExportacion() {
		return this.getCostoBasico() * 0.5;
	}
	
	public double getCostoFinal() {
		return this.getCostoExportacion() + this.getCostoBasico();
	}
	
	public boolean getPeriodoFactura(LocalDate inicio, LocalDate fin) {
		return (new DateLapse1(inicio, fin)).includesDate(fechaFacturacion);
	}
	
	public List<Item> getItems() {
		return new ArrayList<>(this.itemsAExportar);
	}

	public LocalDate getFechaExportacion() {
		return fechaExportacion;
	}
	
	public LocalDate getFechaFacturacion() {
		return fechaFacturacion;
	}
}
