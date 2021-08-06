package cs520.module4.L2_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Collection;

public class P07_MapsAndListsCaseStudy {

	public static void main(String[] args) {
		// Create an empty list of Employee objects
		List<Employee> employeeList = new ArrayList<Employee>();
		// Create an empty map of Employee objects
		Map<String, Employee> employeeMap = new HashMap<String, Employee>();

		// Add employee objects to the list and map
		Employee newEmployee;

		newEmployee = new Employee("ID1", "Alice", 51000);
		employeeList.add(newEmployee);
		employeeMap.put("ID1", newEmployee);

		newEmployee = new Employee("ID2", "Bob", 52000);
		employeeList.add(newEmployee);
		employeeMap.put("ID2", newEmployee);

		newEmployee = new Employee("ID3", "Charlie", 53000);
		employeeList.add(newEmployee);
		employeeMap.put("ID3", newEmployee);

		newEmployee = new Employee("ID4", "Dave", 54000);
		employeeList.add(newEmployee);
		employeeMap.put("ID4", newEmployee);

		newEmployee = new Employee("ID5", "Ed", 54000);
		employeeList.add(newEmployee);
		employeeMap.put("ID5", newEmployee);

		System.out.println("List: " + employeeList);
		System.out.println("Map: " + employeeMap);

		// Look up by id
		System.out.printf("Looking up ID2 using List: %s\n", 
			findEmployeeById("ID2", employeeList));
		System.out.printf("Looking up ID2 using Map: %s\n", 
			findEmployeeById("ID2", employeeMap));

		// Look up by name
		System.out.printf("Looking up Bob using List: %s\n", 
			findEmployeeByName("Bob", employeeList));
		System.out.printf("Looking up Bob using Map: %s\n", 
			findEmployeeByName("Bob", employeeMap));
	}

	// Look up employee by id from the list
	private static Employee findEmployeeById(String id, Collection<Employee> employeeList) {
		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			Employee currentEmployee = itr.next();
			if (id.equals(currentEmployee.getEmployeeId())) {
				return currentEmployee;
			}
		}
		return null;
	}

	// Look up employee by id from the map
	private static Employee findEmployeeById(String id, Map<String, Employee> employeeMap) {
		return employeeMap.get(id);
	}

	// Look up employee by name from the list
	private static Employee findEmployeeByName(String name, Collection<Employee> employeeList) {
		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			Employee currentEmployee = itr.next();
			if (name.equals(currentEmployee.getEmployeeName())) {
				return currentEmployee;
			}
		}
		return null;
	}

	// Look up employee by name from the map
	private static Employee findEmployeeByName(String name, Map<String, Employee> employeeMap) {
		Collection<Employee> employees = employeeMap.values();
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee currentEmployee = itr.next();
			if (name.equals(currentEmployee.getEmployeeName())) {
				return currentEmployee;
			}
		}
		return null;
	}
}
