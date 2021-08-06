package cs520.module4.L2_collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class P05_SetDemo {

	public static void main(String[] args) {
		// Create a set of String elements
		Collection<String> myHashSet = new HashSet<String>();
		System.out.printf("Initial size = %d\n", myHashSet.size());

		// Add elements to the set
		myHashSet.add("Charlie");
		System.out.println("Set: " + myHashSet);
		myHashSet.add("Alice");
		System.out.println("Set: " + myHashSet);
		myHashSet.add("Dave");
		System.out.println("Set: " + myHashSet);
		myHashSet.add("Bob");
		System.out.println("Set: " + myHashSet);

		System.out.printf("Size = %d\n", myHashSet.size());

		// Add a duplicate element
		System.out.println("Adding Alice again");
		myHashSet.add("Alice");
		System.out.println("Set: " + myHashSet);

		// Iterate over the elements of the set
		Iterator<String> itr = myHashSet.iterator();

		while (itr.hasNext()) {
			String value = itr.next();
			System.out.printf(" Set element - %s\n", value);
		}

		// Check if Bob is in the set
		if (myHashSet.contains("Bob")) {
			System.out.println("Bob is there in the set");
		} else {
			System.out.println("Bob is not there in the set");
		}

		// Remove Bob from the Set
		System.out.println("Removing Bob from the list");
		myHashSet.remove("Bob");

		System.out.println("Size = " + myHashSet.size());
		System.out.println("List: " + myHashSet);

		// Check if Bob is in the set
		if (myHashSet.contains("Bob")) {
			System.out.println("Bob is there in the set");
		} else {
			System.out.println("Bob is not there in the set");
		}

		// Iteration using the for-each loop
		for (String element : myHashSet) {
			System.out.printf(" Set element - %s\n", element);
		}
	}
}
