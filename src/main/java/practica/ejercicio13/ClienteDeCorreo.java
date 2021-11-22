package practica.ejercicio13;

import java.util.*;

public class ClienteDeCorreo {

	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		super();
		this.carpetas = new ArrayList<>();
		this.inbox = new Carpeta("Inbox");
		this.carpetas.add(this.inbox);
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir (Email email) {
		this.inbox.agregarMail(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarMail(email);
		destino.agregarMail(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(c -> c.buscarMail(texto)).filter(email -> email != null).findFirst().orElse(null);
	}
	
	public double espacioOcupado() {
		return this.carpetas.stream().mapToDouble(c -> c.tamanioCarpeta()).sum();
	}
}
