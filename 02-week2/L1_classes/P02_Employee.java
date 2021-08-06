package cs520.module2.L1_classes;

public class P02_Employee {
	// Employee data stored in fields or instance variables
	private String name;
	private int startingSalary;
	private double timeEmployed;

	// Default constructor
	public P02_Employee() {
		name = "Unknown";
		startingSalary = 50000;
		timeEmployed = 0;
	}

	// Constructor with one argument
	public P02_Employee(String name) {
		this.name = name;
		startingSalary = 50000;
		timeEmployed = 0;
	}

	// Constructor with two arguments
	public P02_Employee(String name, int startingSalary) {
		this(name, startingSalary, 0.0);
	}

	// Constructor with three arguments
	public P02_Employee(String name, int startingSalary, double timeEmployed) {
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
		double result;
		result = startingSalary + startingSalary * 0.04 * timeEmployed;
		return result;
	}

	public void printEmployeeData() {
		System.out.println("Employee " + name + "\n started with a salary of $ " + getStartingSalary() + "\n"
				+ getTimeEmployed() + " years ago and has a" + "\n current salary of $" + getCurrentSalary());
	}

}