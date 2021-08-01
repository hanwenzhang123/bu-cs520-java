allows elements to be inserted and deleted from both ends of the queue


The following operations are used for inserting elements at the head and the tail of a deque.
void addFirst(Object element)—used to add the specified element at the head (as the first element) of the deque. The operation throws an exception if the insertion fails for any reason.
boolean offerFirst(Object element)—used to add the specified element at the head (as the first element) of the deque. It is intended for use on bounded queues. The operation returns true if the insertion is successful and returns false if the insertion fails. An exception is not thrown in the latter case.
void addLast(Object element)—used to add the specified element at the tail (as the last element) of the deque. The operation throws an exception if the insertion fails for any reason.
boolean offerLast(Object element)—used to add the specified element at the tail (as the last element) of the deque. It is intended for use on bounded queues. The operation returns true if the insertion is successful and returns false if the insertion fails. An exception is not thrown in the latter case.

The following operations are used for removing elements from a deque:
Object removeFirst()—retrieves and removes the element at the head of the deque. The operation throws an exception if the deque is empty.
Object pollFirst()—retrieves and removes the element at the head of the deque. The operation returns null if the deque is empty.
Object removeLast()—retrieves and removes the element at the tail of the deque. The operation throws an exception if the deque is empty.
Object pollLast()—retrieves and removes the element at the tail of the queue. The operation returns null if the deque is empty.

The following operations are used for inspecting the elements in a deque.
Object getFirst()—retrieves, but doesn’t remove, the element at the head of the deque. The operation throws an exception if the deque is empty.
Object peekFirst()—retrieves, but doesn’t remove, the element at the head of the deque. The operation returns null if the deque is empty.
Object getLast()—retrieves, but doesn’t remove, the element at the tail of the deque. The operation throws an exception if the deque is empty.
Object peekLast()—retrieves, but doesn’t remove, the element at the tail of the deque. The operation returns null if the deque is empty.


// Create an empty deque
Deque<String> myDeck = new ArrayDeque<String>();

// Insert elements
myDeck.addLast("A1");
System.out.println("Deque: " + myDeck);
myDeck.offerLast("B1");
System.out.println("Deque: " + myDeck);
myDeck.addFirst("C1");
System.out.println("Deque: " + myDeck);
myDeck.offerFirst("D1");
System.out.println("Deque: " + myDeck);

//Output
Deque: [A1]
Deque: [A1, B1]
Deque: [C1, A1, B1]
Deque: [D1, C1, A1, B1]


// Inspect elements at the head of the deque
String headElement = myDeck.getFirst();
System.out.printf("Head using getFirst(): %s\n", headElement);
headElement = myDeck.peekFirst();
System.out.printf("Head using peekFirst(): %s\n", headElement);

// Inspect elements at the tail of the deque
String tailElement = myDeck.getLast();
System.out.printf("Tail using getLast(): %s\n", tailElement);
tailElement = myDeck.peekLast();
System.out.printf("Tail using peekLast(): %s\n", tailElement);

//Output
Head using getFirst(): D1
Head using peekFirst(): D1
Tail using getLast(): B1
Tail using peekLast(): B1


// Remove elements
String removedElement = myDeck.removeFirst();
System.out.printf("#1 Removed Head Element: %s\n", removedElement);
System.out.println("Deque: " + myDeck);
headElement = myDeck.peekFirst();
System.out.printf("Head using peekFirst(): %s\n", headElement);

removedElement = myDeck.removeLast();
System.out.printf("#2 Removed Tail Element: %s\n", removedElement);
System.out.println("Deque: " + myDeck);
headElement = myDeck.peekLast();
System.out.printf("Tail using peekLast(): %s\n", headElement);

//Output
#1 Removed Head Element: D1
Deque: [C1, A1, B1]
Head using peekFirst(): C1
#2 Removed Tail Element: B1
Deque: [C1, A1]
Tail using peekLast(): A1
  
