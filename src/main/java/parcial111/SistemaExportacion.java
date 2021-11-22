package parcial111;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;

public class SistemaExportacion {

	private HashSet<PedidoDeExportacion> pedidos;
	private HashSet<Factura> facturas;
	
	public SistemaExportacion() {
		super();
		this.pedidos = new HashSet<PedidoDeExportacion>();
		this.facturas = new HashSet<Factura>();
	}
	
	public PedidoDeExportacion generarPedidoDeExportacion(String destino, LocalDate fecha, String nombreEmpresa) {
		PedidoDeExportacion p = new PedidoDeExportacion(destino, fecha, nombreEmpresa);
		this.pedidos.add(p);
		return p;
	}
	
	public void agregarBienAPedido(PedidoDeExportacion pedido, String descripcion, int unidades, double peso, double valor) {
		Item Bien = new Bien(descripcion, unidades, peso, valor);
		if(this.pedidos.contains(pedido)) {
			pedido.agregarItem(Bien);
		}
	}
	
	public void agregarServicioAPedido(PedidoDeExportacion pedido, String descripcion, double materiales, double manoObra) {
		Item Servicio = new Servicio(descripcion, materiales, manoObra);
		if(this.pedidos.contains(Servicio)) {
			pedido.agregarItem(Servicio);
		}
	}
	
	public Factura obtenerFacturaConMayorCostoEntre(LocalDate inicio, LocalDate fin) {
		return this.facturas.stream().filter(f -> f.getPeriodoFactura(inicio, fin))
					.max(Comparator.comparingDouble(f -> f.getCostoFinal()))
					.orElse(null);
	}
}
