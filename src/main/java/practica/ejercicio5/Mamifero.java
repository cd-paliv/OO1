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
		if(unMamifero.equals(this.getMadre()) || unMamifero.equals(this.getPadre())) {
			return true;
		} else {
			boolean es = false;
			if(this.getMadre() != null) {
				es = this.getMadre().tieneComoAncestroA(unMamifero);
			}
			if( (this.getPadre() != null) && (! es) ) {
				es = this.getPadre().tieneComoAncestroA(unMamifero);
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
		return this.getMadre() != null ? (this.getMadre()).getMadre() : null;
		/*
		if(this.getMadre() != null)
			return (this.getMadre()).getMadre();
		else return null;
		
		return (this.getMadre()).getMadre();*/ 
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.getPadre() != null) ? (this.getPadre()).getMadre() : null;
		
		/*
		if(this.getPadre() != null)
			return (this.getPadre()).getMadre();
		else return null;
		
		return (this.getPadre()).getMadre();*/
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.getMadre() != null) ? (this.getMadre()).getPadre() : null;
		/*
		if(this.getMadre() != null)
			return (this.getMadre()).getPadre();
		else return null;
		
		return (this.getMadre()).getPadre();*/
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.getPadre() != null) ? (this.getPadre()).getPadre() : null;
		/*
		if(this.getPadre() != null)
			return (this.getPadre()).getPadre();
		else return null;
		
		return (this.getPadre()).getPadre();*/
	}
	
	
}
