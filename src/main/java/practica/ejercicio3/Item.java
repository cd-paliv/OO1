package practica.ejercicio3;

public class Item {

	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public double costo() {
		return (this.getCantidad() * this.getCostoUnitario());
	}

	public String getDetalle() {
		return detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	private void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	public Item detalle(String string) {
		this.setDetalle(string);
		return this;
	}
	
	public Item costoUnitario(int costoUnitario) {
		this.setCostoUnitario(costoUnitario);
		return this;
	}

	public Item cantidad(int i) {
		this.setCantidad(i);
		return this;
	}
	
	
	
	
	
}
