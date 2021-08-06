package cs520.module4.L2_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P03_ListIteratorsDemo {

	public static void main(String[] args) {
		// Create an empty ArrayList of String elements
		List<String> nameList = new ArrayList<String>();

		// Add elements to the list (in this case String objects)
		nameList.add("Alice");
		nameList.add("Bob");
		nameList.add("Charlie");
		nameList.add("Dave");
		nameList.add("Ed");

		// Get the Iterator and iterate over the list
		Iterator<String> itr1 = nameList.iterator();

		while (itr1.hasNext()) {
			String nextElement = itr1.next();
			System.out.printf("Next Element: %s\n", nextElement);
		}

		System.out.println();

		// Get the ListIterator and iterate first in the forward direction
		ListIterator<String> itr2 = nameList.listIterator();

		while (itr2.hasNext()) {
			int nextIndex = itr2.nextIndex();
			String nextElement = itr2.next();
			System.out.printf("Next Element at index %d: %s\n", nextIndex, nextElement);
		}

		System.out.println();

		// Now we are at the end; iterate in the backward direction
		while (itr2.hasPrevious()) {
			int prevIndex = itr2.previousIndex();
			String prevElement = itr2.previous();
			System.out.printf("Previous Element at index %d: %s\n", prevIndex, prevElement);
		}

		System.out.println();

		// Get the forward iterator from the beginning of the list
		ListIterator<String> forwItr = nameList.listIterator();
		int forwIndex = forwItr.nextIndex();

		// Get the backward iterator from the end of the list
		int size = nameList.size();
		ListIterator<String> backItr = nameList.listIterator(size);
		int backIndex = backItr.previousIndex();

		// Examine the elements at both the ends at the same time
		while (forwIndex <= backIndex) {
			String forwElement = forwItr.next();
			String backElement = backItr.previous();
			System.out.printf("Forward (%d): %-8s; Backward (%d): %-8s\n", forwIndex, forwElement, backIndex,
					backElement);
			forwIndex = forwItr.nextIndex();
			backIndex = backItr.previousIndex();
		}

		System.out.println();
	}
}
