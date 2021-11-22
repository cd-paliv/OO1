package practica.ejercicio13;

import java.util.*;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}
	
	public List<Archivo> adjuntos() {
		return new ArrayList<>(this.adjuntos);
	}

	public void agregarAdjunto(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public boolean contiene(String texto) {
		return this.getCuerpo().contains(texto) || this.getTitulo().contains(texto);
	}
	
	public int tamanioMail() {
		return this.titulo.length() + this.cuerpo.length() + this.adjuntos.stream().mapToInt(a -> a.tamanio()).sum();
	}
}
