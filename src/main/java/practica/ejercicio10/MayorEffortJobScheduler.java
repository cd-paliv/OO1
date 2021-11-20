package practica.ejercicio10;

public class MayorEffortJobScheduler extends JobScheduler {

	@Override
	protected JobDescription getNext() {
		return jobs.stream().max((job1, job2) -> Double.compare(job1.getEffort(), job2.getEffort())).orElse(null);
	}
}
