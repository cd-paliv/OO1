package practica.ejercicio6;

import java.util.ArrayList;

public class Farola {

	private boolean on;
	private ArrayList<Farola> vecinos;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		this.on = false;
		this.vecinos = new ArrayList<Farola>();
	}

	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor(Farola otraFarola) {
		if(! this.getNeighbors().contains(otraFarola)) {
			this.addFarola(otraFarola);
			otraFarola.addFarola(this);
		}
	}
	
	public void addFarola(Farola f) {
		vecinos.add(f);
	}

	/*
	* Retorna sus farolas vecinas
	*/
	public ArrayList<Farola> getNeighbors (){
		return vecinos;
	}

	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(! this.isOn()) {
			this.on = true;
			vecinos.stream().forEach(vecinos -> vecinos.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.isOn()) {
			this.on = false;
			vecinos.stream().forEach(vecinos -> vecinos.turnOff());
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return on;
	}

}
