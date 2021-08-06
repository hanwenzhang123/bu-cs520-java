package cs520.module4.L2_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P04_ListIteratorsEmployeeDemo {

	public static void main(String[] args) {
		// Create an empty list of Employee objects
		List<Employee> employeeList = new ArrayList<Employee>();

		// Add elements to the list (in this case Employee objects)
		Employee newEmployee;
		newEmployee = new Employee("ID1", "Alice", 51000);
		employeeList.add(newEmployee);
		newEmployee = new Employee("ID2", "Bob", 52000);
		employeeList.add(newEmployee);
		newEmployee = new Employee("ID3", "Charlie", 53000);
		employeeList.add(newEmployee);
		newEmployee = new Employee("ID4", "Dave", 54000);
		employeeList.add(newEmployee);
		newEmployee = new Employee("ID5", "Ed", 54000);
		employeeList.add(newEmployee);

		System.out.println("List: " + employeeList);

		// Get the iterator and iterate over the list
		Iterator<Employee> itr1 = employeeList.iterator();

		while (itr1.hasNext()) {
			Employee currentEmployee = itr1.next();
			System.out.printf("  Next Employee: %s\n", currentEmployee);
		}

		System.out.println();

		// Get the listIterator and iterate first in the forward direction
		ListIterator<Employee> itr2 = employeeList.listIterator();

		while (itr2.hasNext()) {
			int nextIndex = itr2.nextIndex();
			Employee nextElement = itr2.next();
			System.out.printf("  Next Element at index %d: %s\n", nextIndex, nextElement);
		}

		System.out.println();

		// Now we are at the end; iterate in the backward direction
		while (itr2.hasPrevious()) {
			int prevIndex = itr2.previousIndex();
			Employee prevElement = itr2.previous();
			System.out.printf("  Previous Element at index %d: %s\n", prevIndex, prevElement);
		}
	}
}
