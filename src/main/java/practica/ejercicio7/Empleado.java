package practica.ejercicio7;

public class Empleado {

	private String nombre;
	
	public Empleado() {	}
	
	public Empleado(String nombre) {
		this.setNombre(nombre);
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() * this.aportes();
	}

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
