Stack is a structure that implements a last-in first-out (LIFO) data structure. 
New elements are always inserted onto the top of the stack. Only the element at the top of the stack may be removed from the stack.
  
push (Object)—pushes the specified element onto the top of the stack. The element is also returned as a result of the operation.
Object pop()—returns the element that is on top of the stack. The element is removed from the stack. An exception occurs if the stack is empty.
Object peek()—returns the element that is on top of the stack. The element is not removed from the stack. An exception occurs if the stack is empty.
boolean empty()—returns true is there are no elements in the stack, returns false otherwise.
int search(Object)—returns the position of the specified element with respect to the top of the stack. The element at the top is considered to be at position 1.
  
  
// Create an empty stack
Stack<String> myStack = new Stack<String>();

// Insert elements
myStack.push("A1");
System.out.println("Stack: " + myStack);
myStack.push("B1");
System.out.println("Stack: " + myStack);
myStack.push("C1");
System.out.println("Stack: " + myStack);
myStack.push("D1");
System.out.println("Stack: " + myStack);
  
//Output
Stack: [A1]
Stack: [A1, B1]
Stack: [A1, B1, C1]
Stack: [A1, B1, C1, D1]


// Inspect elements at the top of the stack
String topElement = myStack.peek();
System.out.printf("Top using peek(): %s\n", topElement);

//Output
Top using peek(): D1


// Remove elements
String removedElement = myStack.pop();
System.out.printf("#1 Removed Element: %s\n", removedElement);
System.out.println("Stack: " + myStack);
topElement = myStack.peek();
System.out.printf("Top using peek(): %s\n", topElement);

removedElement = myStack.pop();
System.out.printf("#2 Removed Element: %s\n", removedElement);
System.out.println("Stack: " + myStack);
topElement = myStack.peek();
System.out.printf("Top using peek(): %s\n", topElement);

//Output
#1 Removed Element: D1
Stack [A1, B1, C1]
Top using peek():c1
#2 Removed Element: C1
Stack: [A1, B1]
Top using peek(): B1
 
