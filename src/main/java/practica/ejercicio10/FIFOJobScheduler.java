package practica.ejercicio10;

public class FIFOJobScheduler extends JobScheduler {

	@Override
	protected JobDescription getNext() {
		return jobs.get(0);
	}
}
