package cs520.module2.L1_classes;

public class P04_Employee {
	// Employee data are stored in fields or instance variables
	private String name;
	private int startingSalary;
	private double timeEmployed;

	// Default constructor
	public P04_Employee() {
		this("Unknown", 50000, 0);
	}

	// Constructor with one argument
	public P04_Employee(String name) {
		this(name, 50000, 0);
	}

	// Constructor with two arguments
	public P04_Employee(String name, int startingSalary) {
		this(name, startingSalary, 0);
	}

	// Constructor with three arguments
	public P04_Employee(String name, int startingSalary, double timeEmployed) {
		this.name = name;
		this.startingSalary = startingSalary;
		this.timeEmployed = timeEmployed;
	}

	// Mutator methods change the field values
	public void setName(String x) {
		name = x;
	}

	public void setStartingSalary(int value) {
		startingSalary = value;
	}

	public void setTimeEmployed(double value) {
		timeEmployed = value;
	}

	// Accessor methods provide the field values
	public String getName() {
		return name;
	}

	public int getStartingSalary() {
		return startingSalary;
	}

	public double getTimeEmployed() {
		return timeEmployed;
	}

	public double getCurrentSalary() {
		double result = startingSalary + startingSalary * 0.04 * timeEmployed;
		return result;
	}

	public void printEmployeeData() {
		System.out.println("Employee " + name + "\n started with a salary of $ " + getStartingSalary() + "\n"
				+ getTimeEmployed() + " years ago and has a" + "\n current salary of $" + getCurrentSalary());
	}

	// Check if two employee instances are equal
	public boolean equals(P04_Employee other) {
		if ((this.startingSalary == other.startingSalary) && (this.timeEmployed == other.timeEmployed)) {
			return true;
		} else {
			return false;
		}
	}

}
