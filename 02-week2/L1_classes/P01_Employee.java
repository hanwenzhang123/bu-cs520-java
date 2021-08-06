package cs520.module2.L1_classes;

public class P01_Employee {
	// Employee data stored in fields or instance variables

	private String name;
	private int startingSalary;
	private double timeEmployed;

	// "Setter" (mutator) methods change the field values
	public void setName(String name) {
		this.name = name;
	}

	public void setStartingSalary(int value) {
		this.startingSalary = value;
	}

	public void setTimeEmployed(double value) {
		this.timeEmployed = value;
	}

	// "Getter" (accessor) methods provide the field values
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
		double result = this.startingSalary + this.startingSalary * 0.04 * this.timeEmployed;
		return result;
	}

	public void printEmployeeData() {
		System.out.println("Employee " + this.name + "\n started with a salary of $" + this.getStartingSalary() + "\n"
			+ this.getTimeEmployed() + " years ago and has a" + "\n current salary of $" + this.getCurrentSalary());
	}

}
