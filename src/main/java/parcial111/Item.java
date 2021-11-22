package parcial111;

public abstract class Item {
	
	private String descripcion;
	
	public Item(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract double getCosto();
}
