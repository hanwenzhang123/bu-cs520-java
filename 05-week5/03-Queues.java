A queue is used to implement a typical first-in first-out data structure. 
  
The following operations are used for inserting elements into a queue:
boolean add(Object element)—used to add the specified element at the end of the queue. The operation returns true if the insertion is successful but throws an exception if the insertion fails for any reason.
boolean offer(Object element)—used to add the specified element at the end of the queue. It is intended for use on bounded queues. The operation returns true if the insertion is successful and returns false if the insertion fails. An exception is not thrown in this case.
  
The following operations are used for removing elements from a queue:
Object remove()—retrieves and removes the element at the head of the queue. The operation throws an exception if the queue is empty.
Object poll()—retrieves and removes the element at the head of the queue. The operation returns null if the queue is empty.
  
The following operations are used for inspecting the elements in a queue.
Object element()—retrieves, but doesn’t remove, the element at the head of the queue. The operation throws an exception if the queue is empty.
Object peek()—retrieves, but doesn’t remove, the element at the head of the queue. The operation returns null if the queue is empty.
  
  
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
  
//Output
Queue: [A1]
Queue: [A1, B1]
Queue: [A1, B1, C1]
Queue: [A1, B1, C1, D1]
  
  
// Inspecting elements at the head of the queue
String headElement = myQueue.peek();
System.out.printf("Head using peek(): %s\n", headElement);
headElement = myQueue.element();
System.out.printf("Head using element(): %s\n", headElement);

//Output
Head using peek(): A1
Head using element(): A1
  
  
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
  
//Output
#1 Removed Element: A1
Queue: [B1, C1, D1]
Head using element(): B1
#2 Removed Element: B1
Queue: [C1, D1]
Head using element(): C1
    
  
