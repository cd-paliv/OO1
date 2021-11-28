package parcial2311;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SitioFinanciero {

	List<Proyecto> proyectos;
	List<Usuario> usuarios;
	
	public SitioFinanciero() {
		super();
		this.proyectos = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}
	
	public void registrarUsuario(String nombre) {
		Usuario u = new Usuario(nombre);
		this.usuarios.add(u);
	}
	
	public void registrarProyecto(Usuario usuario, String titulo, String descripcion, double montoMin, LocalDate fechaLimite) {
		Proyecto p = new Proyecto(usuario, titulo, descripcion, montoMin, fechaLimite);
		this.proyectos.add(p);
	}

	public void aportarAProyecto(Proyecto proyectoAAportar, Usuario usuario, double monto) {
		if(! usuario.soyDuenio(proyectoAAportar)) { //°°°°°
			Aporte a = new Aporte(proyectoAAportar, usuario, monto);
			usuario.aportarAProyecto(a);
			proyectoAAportar.recibirAporte(a);
		}
	}
    
    public List<Proyecto> listarProyectosVigentes() {
    	return this.proyectos.stream().filter(f -> f.estaVigente()).toList();
    }
    
    public List<Proyecto> listarProyectosVigentesConFinanciacionCompleta(){
    	return this.listarProyectosVigentes().stream().filter(p -> p.estaFinanciado()).toList();
    }
    
    public List<Proyecto> listarProyectosConAportesEntre(LocalDate inicio, LocalDate fin) {
    	return this.proyectos.stream().filter(p -> p.aportesEntreFechas(inicio, fin)).toList();
    }
	
    public List<Proyecto> listarProyectosPostivosEntre(LocalDate inicio, LocalDate fin) {
    	return this.listarProyectosConAportesEntre(inicio, fin)
    	.stream().filter(p -> p.elCreadorTieneTasaMayorA())
    	.toList();
    }
}
