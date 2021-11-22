package parcial111;

public class Servicio extends Item {

	private double costoMateriales;
	private double costoManoDeObra;
	
	public Servicio(String descripcion, double costoMateriales, double costoManoDeObra) {
		super(descripcion);
		this.costoMateriales = costoMateriales;
		this.costoManoDeObra = costoManoDeObra;
	}
	
	public double getCosto() {
		return this.costoManoDeObra * this.costoMateriales;
	}
}
