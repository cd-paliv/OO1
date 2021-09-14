package practica.ejercicio7;

public class Gerente extends EmpleadoJerarquico {

	public Gerente() { }
	
	public Gerente(String nombre) {
		this.setNombre(nombre);
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
	
	public double montoBasico() {
		return 57000;
	}
	
}
