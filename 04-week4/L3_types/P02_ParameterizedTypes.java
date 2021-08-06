package cs520.module4.L3_types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * This is an example of data structures using parameterized types.
 */

public class P02_ParameterizedTypes {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("I'm a String 1");
		myList.add("I'm a String 2");
		myList.add("I'm a String 3");
		// Uncomment the next line to see that the compiler will disallow
		// adding values that are not of type String
		//myList.add(new Employee());
		
		// Iterator is also created with the <String> type
		Iterator<String> iterator = myList.iterator();
		
		while (iterator.hasNext()) {
			// iterator.next() will only return Strings 
			String s = iterator.next();
			// Do something that only Strings can do
			System.out.println(s.length());
		}
		
		Map<String, Employee> myMap = new HashMap<String, Employee>();
		myMap.put("Employee 1", new Employee("Alice"));
	}
}
