package practica.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public double calcularTotal() {
		return items.stream().mapToDouble(items -> items.costo()).sum();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Presupuesto cliente(String string) {
		this.setCliente(string);
		return this;
	}

	public void agregarItem(Item item) {
		items.add(item);
	}
}
