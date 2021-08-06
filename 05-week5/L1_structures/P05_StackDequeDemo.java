package cs520.module5.L1_structures;

import java.util.Deque;
import java.util.ArrayDeque;

public class P05_StackDequeDemo {

	public static void main(String[] args) {

		Deque<String> myStack = new ArrayDeque<String>();

		// Insert elements
		myStack.addFirst("A1");
		System.out.println("Stack: " + myStack);
		myStack.addFirst("B1");
		System.out.println("Stack: " + myStack);
		myStack.addFirst("C1");
		System.out.println("Stack: " + myStack);
		myStack.addFirst("D1");
		System.out.println("Stack: " + myStack);

		// Inspect elements at the top of the stack
		String topElement = myStack.peekFirst();
		System.out.printf("Top using peekFirst(): %s\n", topElement);

		// Remove elements
		String removedElement = myStack.removeFirst();
		System.out.printf("#1 Removed Element: %s\n", removedElement);
		System.out.println("Stack: " + myStack);
		topElement = myStack.peekFirst();
		System.out.printf("Top using peek(): %s\n", topElement);

		removedElement = myStack.removeFirst();
		System.out.printf("#2 Removed Element: %s\n", removedElement);
		System.out.println("Stack: " + myStack);
		topElement = myStack.peekFirst();
		System.out.printf("Top using peek(): %s\n", topElement);
	}
}
