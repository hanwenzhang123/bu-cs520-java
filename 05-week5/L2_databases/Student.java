package cs520.module5.L2_databases;

public class Student {

	private String name;
	private String course;

	// Constructor
	public Student(String name, String course) {
		this.name = name;
		this.course = course;
	}

	// Getter methods (setter methods not implemented)
	public String getName() {
		return name;
	}

	public String getCourse() {
		return this.course;
	}

	public String toString() {
		return String.format("(%s, %s)", name, course);
	}
}
