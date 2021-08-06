package cs520.module2.L1_classes;

public class P04_EmployeeTest {
	public static void main(String[] args) {
		P04_Employee e1 = new P04_Employee("Alice", 70000, 2);
		P04_Employee e2 = new P04_Employee("Bob", 70000, 2);

		if (e1.equals(e2)) {
			System.out.println(e1.getName() + " and " + e2.getName() + " are equal");
		}
	}
}
