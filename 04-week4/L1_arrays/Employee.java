package cs520.module4.L1_arrays;

public class Employee {

	private String name;
	private int salary;

	// Constructor
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// Getter methods (setter methods not implemented)
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		return String.format("(%s, %s)", name, salary);
	}
}
