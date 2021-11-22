package parcial111;

public class Bien extends Item{

	private int unidades;
	private double pesoUnitario;
	private double valorUnitario;
	
	public Bien(String descripcion, int unidades, double pesoUnitario, double valorUnitario) {
		super(descripcion);
		this.unidades = unidades;
		this.pesoUnitario = pesoUnitario;
		this.valorUnitario = valorUnitario;
	}
	
	public double getCosto() {
		double total=unidades * valorUnitario;
		if((unidades * pesoUnitario) > 1000) {
			total += total*0.1;
		}
		return total;
	}
}
