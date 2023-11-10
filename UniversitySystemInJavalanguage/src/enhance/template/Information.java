package enhance.template;

import java.time.LocalDate;

public class Information {

	private int id;
	private LocalDate date;

	public Information(int id) {
		this.id = id;
		this.date = LocalDate.now();
	}

	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}
}