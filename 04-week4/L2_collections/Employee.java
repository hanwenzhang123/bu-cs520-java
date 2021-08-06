package cs520.module4.L2_collections;

public class Employee {

	private String employeeId;
	private String employeeName;
	private int employeeSalary;

	// Constructor
	public Employee(String id, String name, int salary) {
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;
	}

	// Get methods (set methods not implemented)
	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public String toString() {
		return String.format("(%s, %s, %s)", employeeName, employeeId, employeeSalary);
	}
}
