package practica.ejercicio8;

import java.util.ArrayList;
import java.util.Optional;

public class Usuario {

	private String domicilio;
	private String nombre;
	private ArrayList<Factura> _facturas = new ArrayList<Factura>();
	private ArrayList<Consumo> _consumos = new ArrayList<Consumo>();
	
	public Usuario() {}
	
	public Usuario(String domicilio, String nombre) {
		super();
		this.domicilio = domicilio;
		this.nombre = nombre;
	}
	
	public Usuario(String domicilio, String nombre,
						ArrayList<Factura> _facturas, ArrayList<Consumo> _consumos) {
		super();
		this.domicilio = domicilio;
		this.nombre = nombre;
		this._facturas = _facturas;
		this._consumos = _consumos;
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.addMedicion(medicion);
	}
	private void addMedicion(Consumo medicion) {
		_consumos.add(medicion);
	}
	
	
	private Optional<Consumo> ultimoConsumoAsOptional(){
		return (_consumos.stream().max( (Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha()) ) );
	}
	public double ultimoConsumoActiva() {
		return this.ultimoConsumoAsOptional().map((Consumo c1) -> c1.getConsumoEnergiaActiva()).orElse(0d);
		
		//return (_consumos.get(_consumos.size() - 1)).factorDePotencia();
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo ult = this.ultimoConsumo();
		if(ult == null) {
			return new Factura(0, 0, this);
		}
		
		double descuento = 0d;
		if(ult.factorDePotencia() > 0.8d) {
			descuento = 10;
		}
		return new Factura (this.ultimoConsumo().costoEnBase(precioKWh),
								descuento, this);
	}
	
	public ArrayList<Factura> facturas(){
		return _facturas;
	}

	public Consumo ultimoConsumo() {
		return this.ultimoConsumoAsOptional().orElse(null);
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
