package practica.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {

	protected List<JobDescription> jobs;
	
	public JobScheduler() {
		this.jobs = new ArrayList<>();
	}
	
	public void schedule(JobDescription job) {
		this.jobs.add(job);
	}
	
	public void unschedule(JobDescription job) {
		if (job != null) {
			this.jobs.remove(job);
		}
	}
	
	protected abstract JobDescription getNext();
	
	public JobDescription next() {
		JobDescription sig = this.getNext();
		this.unschedule(sig);
		return sig;
	}
}
