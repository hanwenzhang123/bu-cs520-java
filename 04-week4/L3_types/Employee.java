package cs520.module4.L3_types;

public class Employee {

	private String employeeId;
	private String employeeName;
	private int employeeSalary;

	// Constructor
	public Employee(String name) {
		this.employeeName = name;
	}

	// Constructor
	public Employee(String id, String name, int salary) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeSalary = salary;
	}

	// Get methods (set methods not implemented)
	public String getEmployeeId() {
		return this.employeeId;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public int getEmployeeSalary() {
		return this.employeeSalary;
	}

	public String toString() {
		return String.format("(%s, %s, %s)", this.employeeName, this.employeeId, this.employeeSalary);
	}
}
