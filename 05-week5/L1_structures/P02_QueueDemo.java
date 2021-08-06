package cs520.module5.L1_structures;

import java.util.LinkedList;

public class P02_QueueDemo {

	public static void main(String[] args) {

		LinkedList<String> myQueue = new LinkedList<String>();

		// Inserting elements
		myQueue.add("A1");
		System.out.println("Queue: " + myQueue);
		myQueue.add("B1");
		System.out.println("Queue: " + myQueue);
		myQueue.offer("C1");
		System.out.println("Queue: " + myQueue);
		myQueue.offer("D1");
		System.out.println("Queue: " + myQueue);

		// Inspecting elements at the head of the queue
		String headElement = myQueue.peek();
		System.out.printf("Head using peek(): %s\n", headElement);
		headElement = myQueue.element();
		System.out.printf("Head using element(): %s\n", headElement);

		// Removing elements
		String removedElement = myQueue.remove();
		System.out.printf("#1 Removed Element: %s\n", removedElement);
		System.out.println("Queue: " + myQueue);
		headElement = myQueue.element();
		System.out.printf("Head using element(): %s\n", headElement);

		removedElement = myQueue.poll();
		System.out.printf("#2 Removed Element: %s\n", removedElement);
		System.out.println("Queue: " + myQueue);
		headElement = myQueue.element();
		System.out.printf("Head using element(): %s\n", headElement);
	}
}
