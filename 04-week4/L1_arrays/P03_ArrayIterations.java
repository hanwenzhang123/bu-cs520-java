package cs520.module4.L1_arrays;

public class P03_ArrayIterations {

	public static void main(String[] args) {

		// An int array and a String array
		int[] salaries = { 50000, 51000, 52000, 53000, 54000 };
		String[] names = { "Alice", "Bob", "Charlie", "Dave", "Ed" };

		System.out.printf("Length of salaries array = %d\n", salaries.length);
		System.out.printf("Length of names array = %d\n", names.length);

		// Loop using the "for" statement
		System.out.println("-- Using the for statement");
		for (int index = 0; index < salaries.length; index++) {
			String employeeName = names[index];
			int employeeSalary = salaries[index];
			System.out.printf("%s's salary is %d\n", employeeName, employeeSalary);
		}

		// Compute the sum of the salaries
		int sum = 0;
		for (int index = 0; index < salaries.length; index++) {
			sum += salaries[index];
		}

		// Display results
		System.out.printf("Sum of salaries = %d\n", sum);
		System.out.printf("Average salary = %d\n", sum / salaries.length);

		// Loop using the for-each construct
		System.out.println("-- Using the for-each statement");
		sum = 0;

		for (int salary : salaries) {
			System.out.printf("Someone's salary is %d\n", salary);
			sum += salary;
		}
		System.out.printf("Sum of salaries = %d\n", sum);
		System.out.printf("Average salary = %d\n", sum / salaries.length);
	}

}
