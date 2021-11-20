package practica.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {

	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		super();
		this.nombre = nombre;
		this.inversiones = new ArrayList<>();
	}
	
	public double valorActual() {
		return inversiones.stream().mapToDouble(num -> num.valorActual()).sum();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Inversion> getInversiones() {
		return inversiones;
	}

	public void agregarInversion(Inversion in) {
		this.inversiones.add(in);
	}
	
	
}
