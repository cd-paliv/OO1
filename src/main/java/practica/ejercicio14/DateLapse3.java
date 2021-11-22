package practica.ejercicio14;

import java.time.LocalDate;

public class DateLapse3 implements IDateLapse {

	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse3(LocalDate from, int sizeInDays) {
		super();
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return this.getFrom().plusDays(sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
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
