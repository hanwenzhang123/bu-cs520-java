package cs520.module2.L1_classes;

public class P05_Employee {
	// Employee data stored in fields or instance variables
	private String name;
	private int startingSalary;
	private double timeEmployed;

	// Static variable for employee count
	private static int employeeCount = 0;

	// Default constructor
	public P05_Employee() {
		this("Unknown", 50000, 0);
	}

	// Constructor with one argument
	public P05_Employee(String name) {
		this(name, 50000, 0);
	}

	// Constructor with two arguments
	public P05_Employee(String name, int startingSalary) {
		this(name, startingSalary, 0);
	}

	// Constructor with three arguments
	public P05_Employee(String name, int startingSalary, double timeEmployed) {
		this.name = name;
		this.startingSalary = startingSalary;
		this.timeEmployed = timeEmployed;

		// Increment the static employee count
		employeeCount++;
	}

	// Get the static employee count
	public static int getEmployeeCount() {
		return employeeCount;
	}

	// Mutator methods change the field values
	public void setName(String name) {
		this.name = name;
	}

	public void setStartingSalary(int startingSalary) {
		this.startingSalary = startingSalary;
	}

	public void setTimeEmployed(double timeEmployed) {
		this.timeEmployed = timeEmployed;
	}

	// Accessor methods provide the field values
	public String getName() {
		return this.name;
	}

	public int getStartingSalary() {
		return this.startingSalary;
	}

	public double getTimeEmployed() {
		return this.timeEmployed;
	}

	public double getCurrentSalary() {
		double result;
	result = startingSalary + startingSalary * 0.04 * timeEmployed;
		return result;
	}

	public void printEmployeeData() {
		System.out.println("Employee " + name + "\n started with a salary of $ " + getStartingSalary() + "\n"
				+ getTimeEmployed() + " years ago and has a" + "\n current salary of $" + getCurrentSalary());
	}

	// Check if two employee instances are equal
	public boolean equals(P05_Employee other) {
		if ((this.startingSalary == other.startingSalary) && (this.timeEmployed == other.timeEmployed)) {
			return true;
		} else {
			return false;
		}
	}

}