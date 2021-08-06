package cs520.module2.L2_oop;

public class P02_Employee {
	// Employee data stored in fields or instance variables
	private String name;
	private int startingSalary;
	private double timeEmployed;

	// Default constructor
	public P02_Employee() {
		this("Unknown", 50000, 0);
	}

	// Constructor with one argument - name
	public P02_Employee(String name) {
		this(name, 50000, 0);
	}

	// Constructor with two arguments
	public P02_Employee(String name, int startingSalary) {
		this(name, startingSalary, 0);
	}

	// Constructor with three arguments
	public P02_Employee(String name, int startingSalary, double timeEmployed) {
		this.name = name;
		this.startingSalary = startingSalary;
		this.timeEmployed = timeEmployed;
	}

	// Setter methods change the field values
	public void setName(String x) {
		name = x;
	}

	public void setStartingSalary(int value) {
		startingSalary = value;
	}

	public void setTimeEmployed(double value) {
		timeEmployed = value;
	}

	// Getter methods provide the field values
	public String getName() {
		return name;
	}

	public int getStartingSalary() {
		return startingSalary;
	}

	public double getTimeEmployed() {
		return timeEmployed;
	}

	// Other methods perform operations on Employee data
	public double getCurrentSalary() {
		double result = startingSalary + startingSalary * 0.04 * timeEmployed;
		return result;
	}

	public double getCurrentSalary(double raise) {
		double result = startingSalary + startingSalary * raise * timeEmployed;
		return result;
	}

	public double getCurrentSalary(int percentRaise) {
		double result = startingSalary + startingSalary * percentRaise * timeEmployed / 100;
		return result;
	}

	public void printEmployeeData() {
		System.out.println("Employee " + name + "\n started with a salary of $ " + getStartingSalary());
		System.out.println(getTimeEmployed() + " years ago and has a" + "\n current salary of $" + getCurrentSalary());
	}

}