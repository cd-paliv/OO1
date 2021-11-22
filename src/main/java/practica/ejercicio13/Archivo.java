package practica.ejercicio13;

public class Archivo {

	private String nombre;
	
	public Archivo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamanio() {
		return this.getNombre().length();
	}

}
