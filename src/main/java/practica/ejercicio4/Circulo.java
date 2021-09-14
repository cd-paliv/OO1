package practica.ejercicio4;

public class Circulo implements Figura{

	private double radio;
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return radio * 2;
	}
	
	public void setDiametro(double diametro) {
		this.setRadio(diametro / 2);
	}
	
	public double getPerimetro() {
		return this.getDiametro() * Math.PI;
	}
	
	public double getArea() {
		return (Math.pow(this.getRadio(), 2) * Math.PI);
	}
}
