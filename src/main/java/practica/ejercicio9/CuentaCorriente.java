package practica.ejercicio9;

public class CuentaCorriente extends Cuenta{

	private double descubierto; //máximo saldo negativo permitido
	
	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() - monto) >= this.getDescubierto();
	}
}
