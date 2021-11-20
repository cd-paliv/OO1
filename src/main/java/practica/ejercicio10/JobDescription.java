package practica.ejercicio10;

public class JobDescription {

	private double effort;
	private int priority;
	private String description;
	
	public JobDescription(double effort, int priority, String description) {
		super();
		this.effort = effort;
		this.priority = priority;
		this.description = description;
	}
	
	public double getEffort() {
		return effort;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public String getDescription() {
		return description;
	}
	
	
}
