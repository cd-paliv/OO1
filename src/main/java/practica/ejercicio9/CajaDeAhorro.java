package practica.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	private double montoConAdicional(double monto) {
		return monto + (monto * 0.02);
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() - montoConAdicional(monto)) >= 0;
	}
	
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(montoConAdicional(monto));
	}
}
