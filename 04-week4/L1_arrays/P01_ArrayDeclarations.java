package cs520.module4.L1_arrays;

public class P01_ArrayDeclarations {

	public static void main(String[] args) {

		// Declare an array of integer values
		int[] salaries;

		// Allocate the size of the array
		salaries = new int[5];

		System.out.println(salaries[2]);

		// Initialize the values of the array
		salaries[0] = 50000;
		salaries[1] = 51000;
		salaries[2] = 52000;
		salaries[3] = 53000;
		salaries[4] = 54000;

		// Process the elements of the array
		int sum = salaries[0] + salaries[1] + salaries[2] + salaries[3] + salaries[4];
		System.out.printf("Sum of salaries = %d\n", sum);

		// Create String array
		String[] names = { "Alice", "Bob", "Charlie", "Dave", "Ed" };
		
		// Access the info about the second employee
		String secondEmployeeName = names[1];
		int secondEmployeeSalary = salaries[1];
		System.out.printf("%s's Salary is %d\n", secondEmployeeName, secondEmployeeSalary);
		
		// Access the info about the last employee
		String lastEmployeeName = names[4];
		int lastEmployeeSalary = salaries[4];
		System.out.printf("%s's Salary is %d\n", lastEmployeeName, lastEmployeeSalary);

	}

}
