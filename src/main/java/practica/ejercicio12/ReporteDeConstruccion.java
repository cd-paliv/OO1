package practica.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {

	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double getVolumenDeMaterial(String material) {
		return this.piezas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(pv -> pv.volumen()).sum();
	} //filtro las piezas con el material parámetro y sumo los volumenes de cada una
	
	public double getSuperficieDeColor(String color) {
		return this.piezas.stream().filter(p -> p.getColor().equals(color)).mapToDouble(ps -> ps.superficie()).sum();
	} //filtro las piezas con el color parámetro y sumo las superficies de cada una
}
