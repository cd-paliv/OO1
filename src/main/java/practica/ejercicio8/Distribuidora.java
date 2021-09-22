package practica.ejercicio8;

import java.util.ArrayList;

public class Distribuidora {

	private double precioKWh;
	private ArrayList<Usuario> _usuarios = new ArrayList<Usuario>();
	
	public Distribuidora() {}
	
	public Distribuidora(double precioKWh) {
		super();
		this.precioKWh = precioKWh;
	}

	public void agregarUsuario(Usuario otroUsuario) {
		this.addUsuario(otroUsuario);
	}
	
	private void addUsuario(Usuario otroUsuario) {
		_usuarios.add(otroUsuario);
	}
	
	public ArrayList<Factura> facturar() {
		ArrayList<Factura> f = new ArrayList<Factura>();
		_usuarios.stream().map(_usuarios -> f.add(_usuarios.facturarEnBaseA(precioKWh)));
		return f;
	}
	
	public double consumoTotalActiva() {
		return this._usuarios.stream().mapToDouble((Usuario u) -> u.ultimoConsumoActiva()).sum();
	}
	
	public void precioKWh(double precio) {
		precioKWh = precio;
	}

	public double getPrecioKW() {
		return precioKWh;
	}

	public ArrayList<Usuario> getUsuarios() {
		return _usuarios;
	}
}
