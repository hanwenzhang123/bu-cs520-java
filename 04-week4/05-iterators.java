The Iterator interface defines the iteration over the objects in a collection. 
Iterator provides methods to check whether there is a next element for iteration, to retrieve the next element and to remove the current element from the underlying collection.

// Create an empty ArrayList of String elements
   List<String> nameList = new ArrayList<String>();
   // Add elements to the list (in this case String objects)
   nameList.add("Alice");
   nameList.add("Bob");
   nameList.add("Charlie");
   nameList.add("Dave");
   nameList.add("Ed");


//The Iterator() method on the list provides the simple Iterator, which allows the navigation of the underlying elements in the forward direction as shown in the code below:
   // Get the Iterator and iterate over the list
   Iterator<String> itr1 = nameList.iterator();
   while (itr1.hasNext()) {
       String nextElement = itr1.next();
       System.out.printf("Next Element: %s\n", nextElement);
}


The listIterator() method on the list provides the Iterator, which allows navigation of the underlying elements in both the forward and backward directions. The list elements are iterated in the forward direction using the next() method as shown in the code below:
// Get the ListIterator and iterate first in the forward direction
   ListIterator<String> itr2 = nameList.listIterator();
   while (itr2.hasNext()) {
       int nextIndex = itr2.nextIndex();
       String nextElement = itr2.next();
       System.out.printf("Next Element at index %d: %s\n", nextIndex, nextElement);
}
// The output of the above statements is shown below:
//    Next Element at index 0: Alice
//    Next Element at index 1: Bob
//    Next Element at index 2: Charlie
//    Next Element at index 3: Dave
//    Next Element at index 4: Ed

   while (itr2.hasPrevious()) {
       int prevIndex = itr2.previousIndex();
       String prevElement = itr2.previous();
       System.out.printf("Previous Element at index %d: %s\n", prevIndex, prevElement);
}
// The output of the above statement is shown below:
//    Previous Element at index 4: Ed
//    Previous Element at index 3: Dave
//    Previous Element at index 2: Charlie
//    Previous Element at index 1: Bob
//    Previous Element at index 0: Alice


// Get the forward Iterator from the beginning of the list 
ListIterator<String> forwItr = nameList.listIterator(); 
int forwIndex = forwItr.nextIndex();
// Get the backward Iterator from the end of the list
int size = nameList.size();
ListIterator<String> backItr = nameList.listIterator(size); 
int backIndex = backItr.previousIndex();
   // Examine the elements at both the ends at the same time
   while (forwIndex <= backIndex) {
       String forwElement = forwItr.next();
       String backElement = backItr.previous();
       System.out.printf("Forward (%d): %-8s; Backward (%d): %-8s\n",
           forwIndex, forwElement, backIndex, backElement);
       forwIndex = forwItr.nextIndex();
       backIndex = backItr.previousIndex();
}
// The output of the above code is shown below:
//    Forward (0): Alice   ; Backward (4): Ed
//    Forward (1): Bob     ; Backward (3): Dave
//    Forward (2): Charlie ; Backward (2): Charlie


//Iterators Over Custom Objects
  // Get the iterator and iterate over the list
   Iterator<Employee> itr1 = employeeList.iterator();
   while (itr1.hasNext()) {
       Employee currentEmployee = itr1.next();
       System.out.printf("  Next Employee: %s\n", currentEmployee);
}
// The output of the above code is shown below:
//    Next Employee: (Alice, ID1, 51000)
//    Next Employee: (Bob, ID2, 52000)
//    Next Employee: (Charlie, ID3, 53000)
//    Next Employee: (Dave, ID4, 54000)
//    Next Employee: (Ed, ID5, 54000)


// Get the listIterator and iterate first in the forward direction
   ListIterator<Employee> itr2 = employeeList.listIterator();
   while (itr2.hasNext()) {
       int nextIndex = itr2.nextIndex();
       Employee nextElement = itr2.next();
       System.out.printf("  Next Element at index %d: %s\n", nextIndex, nextElement);
}
// The output of the above iteration is shown below:
//    Next Element at index 0: (Alice, ID1, 51000)
//    Next Element at index 1: (Bob, ID2, 52000)
//    Next Element at index 2: (Charlie, ID3, 53000)
//    Next Element at index 3: (Dave, ID4, 54000)
//    Next Element at index 4: (Ed, ID5, 54000)



// Now we are at the end; iterate in the backward direction
   while (itr2.hasPrevious()) {
       int prevIndex = itr2.previousIndex();
       Employee prevElement = itr2.previous();
       System.out.printf("  Previous Element at index %d: %s\n", prevIndex, prevElement);
}
// The output of the above iteration is shown below:
//    Previous Element at index 4: (Ed, ID5, 54000)
//    Previous Element at index 3: (Dave, ID4, 54000)
//    Previous Element at index 2: (Charlie, ID3, 53000)
//    Previous Element at index 1: (Bob, ID2, 52000)
//    Previous Element at index 0: (Alice, ID1, 51000)

  
