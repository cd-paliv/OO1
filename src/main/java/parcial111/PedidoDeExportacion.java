package parcial111;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoDeExportacion {

	private String destino;
	private LocalDate fecha;
	private String nombreEmpresa;
	private List<Item> items;
	
	public PedidoDeExportacion(String destino, LocalDate fecha, String nombreEmpresa) {
		super();
		this.destino = destino;
		this.fecha = fecha;
		this.nombreEmpresa = nombreEmpresa;
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item unItem) {
		this.items.add(unItem);
	}
	
	public Factura facturarPedido() {
		Factura f = new Factura(LocalDate.now(), fecha, items);
		return f;
	}
}
