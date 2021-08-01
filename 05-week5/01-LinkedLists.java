In addition to the arrays and the array lists, the Java programming language provides various implementations of commonly used data structures. 
  These include the linked lists, queues, double ended queues, and stacks.
  
//LinkedList
The LinkedList class implements the List interface.
LinkedList class provides the methods to insert, delete, and retrieve elements from the beginning and end of the list.
  
  
The following operations are used for inserting elements into a linked list:
boolean add(Object element)—used for adding the specified element at the end of the linked list. The operation returns true.
void add(int index, Object element)—used for inserting the specified element at the specified position in the linked list. The first element has the index 0. All elements currently in the list from the specified index are shifted to the right.
void addFirst(Object element)—used for inserting the specified element at the beginning of the linked list.
void addLast(Object element)—used for adding the element at the end of the linked list.
  
//Example Code
LinkedList myList = new LinkedList();

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

//Output
List: [A1]
List: [A1, B2]
List: [C3, A1, B2]
List: [D4, C3, A1, B2]
List: [D4, C3, E5, A1, B2]


The following operations are used for inspecting the elements in a linked list.
Object getFirst()—returns the first element in the linked list. The operation throws an exception if the linked list is empty.
Object getLast()—returns the last element in the linked list. The operation throws an exception if the linked list is empty.
Object get (int index)—returns the element which is at the specified position in the linked list. The operation throws an exception if the index is not a valid one.

//Example Code
// Retrieving elements
String firstElement = myList.getFirst();
String lastElement = myList.getLast();
String midElement = myList.get(myList.size() / 2);

System.out.printf("First: %s, Last: %s, Middle: %s\n", firstElement, lastElement, midElement);

//Output
First: D4, Last: B2, Middle: E5


The following operations are used for removing elements from a linked list:
Object remove()—used for retrieving the first element from the linked list. The element is removed from the list. An exception is thrown if the list is empty.
Object remove(int index)—used for retrieving the element at the specified position from the linked list. The element is removed from the list. All elements currently in the list from the specified index are shifted to the left. An exception is thrown if the index is not a valid one.
Object removeFirst()—used for retrieving the first element from the linked list. The element is removed from the list. An exception is thrown if the list is empty.
Object removeLast()—used for retrieving the last element from the linked list. The element is removed from the list. An exception is thrown if the list is empty.

//Example Code
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

//Output
#1 Removed Element: D4
List: [C3, E5, A1, B2]
#1 Removed Element: E5
List: [C3, A1, B2]
#2 Removed Element: C3
List: [A1, B2]
#3 Removed Element: B2
List:[A1]


  //Comparison with ArrayList
The ArrayList and the LinkedList classes implement the List interface. 
Both For applications which require a data structure for maintaining a varying number of elements
The ArrayList provides a constant access time to access any element in the list and to add/remove elements at the end of the list. 
  addition/removal of elements at any other position is an expensive operation. 
The LinkedList provides efficient operations at the beginning and end of the lists.
  in the case of doubly linked lists, addition and removal of elements at any position is also a constant time operation. 
     
         
