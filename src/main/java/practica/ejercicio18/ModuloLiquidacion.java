package practica.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;


public class ModuloLiquidacion {

	private HashSet<Empleado> empleados;
	
	public ModuloLiquidacion() {
		this.empleados = new HashSet<Empleado>();
	}
	
	public void darAltaEmpleado(String nombre, String apellido, int cuil, LocalDate fechaN, boolean hijos, boolean conyuge) {
		Empleado e = new Empleado(nombre, apellido, cuil, fechaN, hijos, conyuge);
		empleados.add(e);
	}
	
	public Empleado buscarEmpleado(int cuil) {
		return this.empleados.stream().filter(e -> e.compararCUIL(cuil)).findFirst().orElse(null);
	}
	
	public void darBajaEmpleado(Empleado e) {
		this.empleados.remove(e);
	}
	
	public List<Empleado> obtenerEmpleadosConContratosVencidos(){
		return this.empleados.stream().filter(e -> e.getContratoActual().estaVencido()).toList();
	}
	
	private List<Empleado> obtenerEmpleadosConContratosVigentes(){
		Predicate<Empleado> pred = e -> e.getContratoActual().estaVencido();
		return this.empleados.stream().filter(pred.negate()).toList();
	}
	
	public List<ReciboDeSueldo> generarRecibos() {
		List<ReciboDeSueldo> recibos = new ArrayList<>();
		this.obtenerEmpleadosConContratosVigentes().forEach(e -> recibos.add(new ReciboDeSueldo(e)));
		return recibos;
	}
}
