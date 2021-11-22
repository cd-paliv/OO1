package practica.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse1 implements IDateLapse {

	private LocalDate from;
	private LocalDate to;
	
	public DateLapse1(LocalDate from, LocalDate to) {
		super();
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays() {
		Long dias = ChronoUnit.DAYS.between(from, to);
		return dias.intValue(); 
	}
	
	public boolean includesDate (LocalDate other) {
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo()) ||
				other.equals(this.getFrom()) || other.equals(this.getTo());
	}
	
	@Override
	public boolean overlaps(IDateLapse anotherDateLapse) {
		return !(anotherDateLapse.getFrom().isBefore(this.getFrom()))
					&& anotherDateLapse.getTo().isBefore(this.getFrom())
				|| anotherDateLapse.getFrom().isAfter(this.getFrom())
					&& anotherDateLapse.getTo().isAfter(this.getTo());
	}
}
