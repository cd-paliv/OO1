package practica.ejercicio2;

import java.util.ArrayList;
import java.time.LocalDate;


public class Balanza {

	//private int cantidadDeProductos;
	//private double precioTotal;
	//private double pesoTotal;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	//3 Bis
	public void ponerEnCero() {
		productos.clear(); //o new ArrayList<Producto>(); acá
		
	}
	
	//tarea 1
	public ArrayList<Producto> getProductos(){
		return productos;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		return productos.stream().mapToDouble(productos -> productos.getPrecio()).sum();
	}
	
	public double getPesoTotal() {
		return productos.stream().mapToDouble(productos -> productos.getPeso()).sum();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now(),
								this.getCantidadDeProductos(),
								this.getPesoTotal(),
								this.getPrecioTotal());
		return t;
	}
	
	/* EJERCICIO 2
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}
	
	public void ponerEnCero() {
		this.setCantidadDeProductos(0);
		this.setPesoTotal(0);
		this.setPrecioTotal(0);
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now(),
								this.getCantidadDeProductos(),
								this.getPesoTotal(),
								this.getPrecioTotal());
		return t;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}*/
	
	
}
