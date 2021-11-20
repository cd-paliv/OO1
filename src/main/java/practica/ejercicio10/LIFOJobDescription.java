package practica.ejercicio10;

public class LIFOJobDescription extends JobScheduler {

	@Override
	protected JobDescription getNext() {
		return jobs.get(jobs.size() - 1);
	}
}
