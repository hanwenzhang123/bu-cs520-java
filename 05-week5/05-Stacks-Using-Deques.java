The Deque methods addFirst(), removeFirst() and peekFirst() are equivalent to the Stack methods push(), pop() and peek() respectively.
  
  
The following example shows the ArrayDeque class being used as a stack:

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

This code will produce the following result. The top of the stack is on the left end.

Stack: [A1]
Stack: [B1, A1]
Stack: [C1, B1, A1]
Stack: [D1, C1, B1, A1]


The inspection method allows us to inspect the element at the top of the stack as shown below:

// Inspect elements at the top of the stack
String topElement = myStack.peekFirst();
System.out.printf("Top using peekFirst(): %s\n", topElement);

The output of the above statement is shown below:

Top using peekFirst(): D1


The methods for removing elements from the stack are shown below:

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

The output of the above statements is shown below:

#1 Removed Element: D1
Stack: [C1, B1, A1]
Top using peek(): C1
#2 Removed Element: C1
Stack: [B1, A1]
Top using peek(): B1
  
