package cs520.module5.L1_structures;

import java.util.LinkedList;

public class P01_LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();

		// Inserting elements
		myList.add("A1"); // same as addLast
		System.out.println("List: " + myList);
		myList.addLast("B2");
		System.out.println("List: " + myList);
		myList.addFirst("C3");
		System.out.println("List: " + myList);
		myList.addFirst("D4");
		System.out.println("List: " + myList);
		myList.add(2, "E5"); // insert at the specified index
		System.out.println("List: " + myList);

		// Retrieving elements
		String firstElement = myList.getFirst();
		String lastElement = myList.getLast();
		String midElement = myList.get(myList.size() / 2);

		System.out.printf("First: %s, Last: %s, Middle: %s\n", firstElement, 
			lastElement, midElement);

		// Removing elements
		String removedElement = myList.remove(); // same as removeFirst
		System.out.printf("#1 Removed Element: %s\n", removedElement);
		System.out.println("List: " + myList);

		removedElement = myList.remove(1); // remove the second element
		System.out.printf("#1 Removed Element: %s\n", removedElement);
		System.out.println("List: " + myList);

		removedElement = myList.removeFirst();
		System.out.printf("#2 Removed Element: %s\n", removedElement);
		System.out.println("List: " + myList);

		removedElement = myList.removeLast();
		System.out.printf("#3 Removed Element: %s\n", removedElement);
		System.out.println("List:" + myList);
	}
}
