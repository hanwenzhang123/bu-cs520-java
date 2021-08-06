package cs520.module4.L1_arrays;

public class P04_ArrayOfEmployeesIterations {

	public static void main(String[] args) {

		// Declare an array of Employee objects
		Employee[] employees = new Employee[5];

		// Initialize the values of the array
		employees[0] = new Employee("Alice", 50000);
		employees[1] = new Employee("Bob", 51000);
		employees[2] = new Employee("Charlie", 52000);
		employees[3] = new Employee("Dave", 53000);
		employees[4] = new Employee("Ed", 54000);

		System.out.printf("Length of employees array = %d\n", employees.length);

		// Loop using the "for" statement
		for (int index = 0; index < employees.length; index++) {
			Employee currentEmployee = employees[index];
			String employeeName = currentEmployee.getName();
			int employeeSalary = currentEmployee.getSalary();
			System.out.printf("%s's Salary is %d\n", employeeName, employeeSalary);
		}

		// Compute the sum of the salaries
		int sum = 0;
		for (int index = 0; index < employees.length; index++) {
			sum += employees[index].getSalary();
		}
		System.out.printf("Sum of salaries = %d\n", sum);
		System.out.printf("Average salary = %d\n", sum / employees.length);

		// Loop using the for-each construct
		sum = 0;
		for (Employee currentEmployee : employees) {
			String employeeName = currentEmployee.getName();
			int employeeSalary = currentEmployee.getSalary();
			System.out.printf("%s's Salary is %d\n", employeeName, employeeSalary);
			// Compute the sum of the salaries
			sum += currentEmployee.getSalary();
		}
		System.out.printf("Sum of salaries = %d\n", sum);
		System.out.printf("Average salary = %d\n", sum / employees.length);
	}
}
