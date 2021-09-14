package practica.ejercicio7;

public class EmpleadoJerarquico extends Empleado{

	public EmpleadoJerarquico() { }
	
	public EmpleadoJerarquico(String nombre) {
		this.setNombre(nombre);
	}
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
}
