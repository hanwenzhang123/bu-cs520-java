package cs520.module4.L2_collections;

import java.util.ArrayList;
import java.util.List;

public class P02_ArrayListEmployeeDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		System.out.println("Initial size = " + employeeList.size());

		// Add elements to the list (in this case Employee objects)
		employeeList.add(new Employee("ID1", "Alice", 51000));
		System.out.println("List: " + employeeList);
		employeeList.add(new Employee("ID2", "Bob", 52000));
		System.out.println("List: " + employeeList);
		employeeList.add(new Employee("ID3", "Charlie", 53000));
		System.out.println("List: " + employeeList);
		employeeList.add(new Employee("ID4", "Dave", 54000));
		System.out.println("List: " + employeeList);
		employeeList.add(new Employee("ID5", "Ed", 55000));
		System.out.println("List: " + employeeList);
		System.out.println("Size = " + employeeList.size());

		System.out.println("Customized list printing:");

		for (int i = 0; i < employeeList.size(); i++) {
			System.out.printf(" Index: %d, Element: %s\n", i, employeeList.get(i));
		}

		System.out.println("For-Each Loop:");

		for (Employee element : employeeList) {
			System.out.printf(" Element: %s\n", element);
		}
	}
}
