package cs520.module4.L2_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class P01_ArrayListDemo {

	public static void main(String[] args) {
		// Create an empty list of String objects
		List<String> nameList = new ArrayList<String>();
		System.out.printf("Initial size = %d\n", nameList.size());

		// Add elements to the list (in this case String objects)
		nameList.add("Alice");
		System.out.println("List: " + nameList);
		nameList.add("Bob");
		System.out.println("List: " + nameList);
		nameList.add("Charlie");
		System.out.println("List: " + nameList);
		nameList.add("Dave");
		System.out.println("List: " + nameList);
		nameList.add("Ed");
		System.out.println("List: " + nameList);
		System.out.printf("Size = %d\n", nameList.size());

		System.out.println("Customized list printing:");

		for (int i = 0; i < nameList.size(); i++) {
			System.out.printf("Index: %d, Element: %s\n", i, nameList.get(i));
		}

		System.out.println("For-Each Loop:");

		for (String element : nameList) {
			System.out.printf(" Element: %s\n", element);
		}

		System.out.printf("Element at position 1 = %s\n", nameList.get(1));

		// Remove Bob from the list
		System.out.println("Removing Bob from the list");
		nameList.remove("Bob");

		System.out.printf("Size = %d\n", nameList.size());
		System.out.println("List: " + nameList);
		System.out.printf("Element at position 1 = %s\n", nameList.get(1));

		// Find the index of Charlie in the list
		int index = nameList.indexOf("Charlie");
		System.out.printf("Index of Charlie = %d\n", index);

		// Remove element at the above index
		String oldElement = nameList.remove(index);
		System.out.printf("Element %s at index %d is removed\n", oldElement, index);
		System.out.printf("Size = %d\n", nameList.size());
		System.out.println("List: " + nameList);
	}
}
