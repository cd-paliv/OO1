package practica.ejercicio13;

import java.util.*;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		super();
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void agregarMail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarMail(Email email) {
		this.emails.remove(email);
	}
	
	public Email getMail(int pos) {
		return this.emails.get(pos);
	}
	
	public List<Email> getEmails(){
		return new ArrayList<>(this.emails);
	}
	
	public Email buscarMail(String texto) {
		return this.emails.stream().filter(e -> e.contiene(texto)).findFirst().orElse(null);
	}
	
	public int tamanioCarpeta() {
		return this.emails.stream().mapToInt(e -> e.tamanioMail()).sum();
	}
}
