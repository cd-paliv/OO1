package parcial2311;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private LocalDate fechaRegistro;
	private List<Aporte> aportesRealizados;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.fechaRegistro = LocalDate.now();
		//this.proyectosPresentados = new ArrayList<>();
		this.aportesRealizados = new ArrayList<>();
	}
	
	public void aportarAProyecto(Aporte aporte) {
		this.aportesRealizados.add(aporte);
	}
	
	public boolean soyDuenio(Proyecto p) {
		return this.getNombre().equals(p.getNombreCreador());
	}
	
	public double obtenerTasaDeAportesDiario() {
		return this.aportesRealizados.stream().mapToDouble(a -> a.getMonto()).sum()
						/
				(ChronoUnit.DAYS.between(LocalDate.now(), fechaRegistro));
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
