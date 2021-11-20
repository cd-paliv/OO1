package practica.ejercicio10;

public class MayorPriorityJobScheduler extends JobScheduler {

	@Override
	protected JobDescription getNext() {
		return jobs.stream().max((job1, job2) -> Double.compare(job1.getPriority(), job2.getPriority())).orElse(null);
	}
}
