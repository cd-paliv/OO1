package practica.ejercicio5;

import java.time.LocalDate;

public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero () { }
	
	public Mamifero (String unMamifero) {
		this.setIdentificador(unMamifero);
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean es = false;
		if(this.getMadre() != null) {
			es = tieneComoAncestroA(unMamifero, this.getMadre());
		}
		if( (this.getPadre() != null) && (! es) ) {
			es = tieneComoAncestroA(unMamifero, this.getPadre());
		}
		return es;
	}
	
	private boolean tieneComoAncestroA(Mamifero unMamifero, Mamifero xadre) {
		if(xadre.getIdentificador().equals(unMamifero.getIdentificador())) {
			return true;
		} else {
			boolean es = false;
			if(xadre.getMadre() != null) {
				es = tieneComoAncestroA(unMamifero, xadre.getMadre());
			}
			if( (xadre.getPadre() != null) && (! es) ) {
				es = tieneComoAncestroA(unMamifero, xadre.getPadre());
			}
			return es;
		}
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre() != null)
			return (this.getMadre()).getMadre();
		else return null;
		
		//return (this.getMadre()).getMadre(); 
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre() != null)
			return (this.getPadre()).getMadre();
		else return null;
		
		//return (this.getPadre()).getMadre();
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.getMadre() != null)
			return (this.getMadre()).getPadre();
		else return null;
		
		//return (this.getMadre()).getPadre();
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.getPadre() != null)
			return (this.getPadre()).getPadre();
		else return null;
		
		//return (this.getPadre()).getPadre();
	}
	
	
}
