package cs520.module4.L2_collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P06_MapsDemo {

	public static void main(String[] args) {
		// Create an empty HashMap, defined as generic Map type on the left side
		Map<String, Integer> salaryMap = new HashMap<String, Integer>();
		// Put entries and values in the HashMap
		salaryMap.put("Alice", 50000);
		System.out.println("Map: " + salaryMap);
		salaryMap.put("Bob", 60000);
		System.out.println("Map: " + salaryMap);
		salaryMap.put("Charlie", 70000);
		System.out.println("Map: " + salaryMap);
		salaryMap.put("Dave", 80000);
		System.out.println("Map: " + salaryMap);
		salaryMap.put("Carol", 80000);
		System.out.println("Map: " + salaryMap);

		// Look up Bob's salary
		int salary = salaryMap.get("Bob");
		System.out.printf("Bob's salary is $%d\n", salary);

		// Give Bob a 10% raise
		int newSalary = (int)(salary + (0.1 * salary));
		salary = salaryMap.put("Bob", newSalary);
		System.out.printf("Bob's new salary $%d replaces old salary $%d\n", 
			newSalary, salary);
		System.out.println("Map: " + salaryMap);

		// Check if a key exists within the map
		if (salaryMap.containsKey("Charlie")) {
			System.out.println("Charlie's entry is in the map");
		} else {
			System.out.println("Charlie's entry is not in the map");
		}

		if (salaryMap.containsKey("Ed")) {
			System.out.println("Ed's entry is in the map");
		} else {
			System.out.println("Ed's entry is not in the map");
		}

		// Access all of the keys in the map
		Collection<String> nameKeys = salaryMap.keySet();
		System.out.println(nameKeys);

		// Iterate over the keys in the map
		Iterator<String> nameIterator = nameKeys.iterator();

		while (nameIterator.hasNext()) {
			String name = nameIterator.next();
			System.out.printf("-- %8s's Salary is $%d\n", name, salaryMap.get(name));
		}

		// Access all of the values in the map
		Collection<Integer> salaries = salaryMap.values();
		Iterator<Integer> salaryIterator = salaries.iterator();

		while (salaryIterator.hasNext()) {
			int value = salaryIterator.next();
			System.out.printf("-- Someone's Salary is $%d\n", value);
		}

		// Remove a key from the map
		salary = salaryMap.remove("Bob");
		System.out.printf("Bob's entry with salary %d removed\n", salary);
		System.out.println("Map: " + salaryMap);

		// Iteration using the for-each construct
		for (String key : nameKeys) {
			System.out.printf("-- %8s's Salary is $%d\n", key, salaryMap.get(key));
		}
	}
}
