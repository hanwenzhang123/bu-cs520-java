package cs520.module4.L1_arrays;

public class P02_ArrayOfEmployees {

	public static void main(String[] args) {
		// Declare an array of Employee objects
		Employee[] employees = new Employee[5];
		
		// Initialize the values of the array
		employees[0] = new Employee("Alice", 50000);
		employees[1] = new Employee("Bob", 51000);
		employees[2] = new Employee("Charlie", 52000);
		employees[3] = new Employee("Dave", 53000);
		employees[4] = new Employee("Ed", 54000);

		// Process the elements of the array
		int sum = employees[0].getSalary() + 
			employees[1].getSalary() + 
			employees[2].getSalary() + 
			employees[3].getSalary() + 
			employees[4].getSalary();
		System.out.printf("Sum of salaries = %d\n", sum);

		// Access the info about the second employee
		Employee secondEmployee = employees[1];
		System.out.printf("%s's Salary is %d\n", secondEmployee.getName(), secondEmployee.getSalary());
		// Access the info about the last employee
		Employee lastEmployee = employees[4];
		System.out.printf("%s's Salary is %d\n", lastEmployee.getName(), lastEmployee.getSalary());

	}

}
