package webg5.courses;

import lombok.Data;

@Data
public class Course {
	private String id;
	private String label;
	private int ects;

	public String toString() {
		return String.format("Course : %s\t%s\t%s ects", this.id, this.label, this.ects);
	}
}
