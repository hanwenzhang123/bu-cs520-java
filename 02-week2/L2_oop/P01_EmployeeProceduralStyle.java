package cs520.module2.L2_oop;

public class P01_EmployeeProceduralStyle {
	public static void main(String[] args) {
		// Variables for the first employee
		String employee1Name;
		int employee1StartingSalary;
		double employee1TimeEmployed;

		// Input data for the first employee
		employee1Name = "Alice";
		employee1StartingSalary = 50000;
		employee1TimeEmployed = 2.0;

		// Computation for the first employee
		double employee1CurrentSalary = employee1StartingSalary + 
				employee1StartingSalary * 0.05 * employee1TimeEmployed;

		// Output result for the first employee
		System.out.println("Employee " + employee1Name + 
			"\n started with a salary of $ " + employee1StartingSalary + "\n"
			+ employee1TimeEmployed + " years ago and has a" + "\n current salary of $"
			+ employee1CurrentSalary);

		// Variables for the second employee
		String employee2Name;
		int employee2StartingSalary;
		double employee2TimeEmployed;

		// Input data for the second employee
		employee2Name = "Bob";
		employee2StartingSalary = 60000;
		employee2TimeEmployed = 5.0;

		// Computation for the second employee
		double employee2CurrentSalary;
		employee2CurrentSalary = employee2StartingSalary + employee2StartingSalary * 0.05 * employee2TimeEmployed;

		// Output result for the second employee
		System.out.println("Employee " + employee2Name + 
			"\n started with a salary of $ " + employee2StartingSalary + "\n"
			+ employee2TimeEmployed + " years ago and has a" + "\n current salary of $"
			+ employee2CurrentSalary);
	}
}