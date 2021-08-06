package cs520.module2.L1_classes;

public class P01_EmployeeTest {

	public static void main(String[] args) {

		// Create an employee
		P01_Employee employee1 = new P01_Employee();

		// Display the employee
		employee1.printEmployeeData();

		// Create another employee
		P01_Employee employee2 = new P01_Employee();

		// Set employee data
		employee2.setName("Alice");
		employee2.setStartingSalary(50000);
		employee2.setTimeEmployed(2);

		// Display the employee
		employee2.printEmployeeData();
	}
}
