package practica.ejercicio11;

public class Acciones implements Inversion {

	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public Acciones(String nombre, int cantidad, double valorUnitario) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	
	public double valorActual() {
		return this.getCantidad() * this.getValorUnitario();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
}
