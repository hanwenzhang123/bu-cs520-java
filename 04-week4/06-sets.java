The Set data structure is used to represent a collection of values without any duplicate elements. The Set data structure is used to represent a collection of values without any duplicate elements. 
  
HashSet: Elements are stored in a hash table for fast implementation. There is no guarantee as to the order of the elements in the set.
TreeSet: Elements are stored internally in a tree data structure, which guarantees logarithmic access time for addition, removal and retrieval of elements. The elements in the set are ordered based on their values.
LinkedHashSet: Elements are stored in a hash table with a linked list. The elements are ordered based on the order in which they are inserted.

  the set doesn’t store the duplicate elements
  
//The HashSet Class
  
   // Create a set of String elements
   Collection<String> myHashSet = new HashSet<String>();
   System.out.printf("Initial size = %d\n", myHashSet.size());
   // Add elements to the set
   myHashSet.add("Charlie");
   System.out.println("Set: " + myHashSet);
   myHashSet.add("Alice");
   System.out.println("Set: " + myHashSet);
   myHashSet.add("Dave");
   System.out.println("Set: " + myHashSet);
   myHashSet.add("Bob");
   System.out.println("Set: " + myHashSet);
   System.out.printf("Size = %d\n", myHashSet.size());

//   Initial size = 0
//    Set: [Charlie]
//    Set: [Alice, Charlie]
//    Set: [Alice, Charlie, Dave]
//    Set: [Bob, Alice, Charlie, Dave]
//    Size = 4
 
Since the set doesn’t store the duplicate elements, the following code has no effect on the set:
   // Add a duplicate element
   System.out.println("Adding Alice again");
   myHashSet.add("Alice");
   System.out.println("Set: " + myHashSet);
// The output of the above code is shown below:
//    Adding Alice again
//    Set: [Bob, Alice, Charlie, Dave]



To examine all the elements in the set, the iterator() method may be invoked on the set. 
  A while loop showing the iteration over each element in the set is shown below:

 // Iterate over the elements of the set
   Iterator<String> itr = myHashSet.iterator();
   while (itr.hasNext()) {
       String value = itr.next();
       System.out.printf("Set element - %s\n", value);
}
// The output of the above statements is shown below:
//    Set element - Bob
//    Set element - Alice
//    Set element - Charlie
//    Set element - Dave

The contains() method checks whether a particular element exists within the set, as shown in below:
   // Check if Bob is in the set
   if (myHashSet.contains("Bob")) {
       System.out.println("Bob is in the set");
   } else {
       System.out.println("Bob is not in the set");
   }
// The output of the above statements is shown below:
//    Bob is in the set


// Remove Bob from the set
   System.out.println("Removing Bob from the set");
   myHashSet.remove("Bob");
   System.out.println("Size = " + myHashSet.size());
   System.out.println("List: " + myHashSet);
// The output of the above statements is shown below:
//    Removing Bob from the set
//    Size = 3
//    List: [Alice, Charlie, Dave]



The for-each construct may also be used to examine the elements of the set, as shown in the code below:
   // Iteration using the for-each loop
   for (String element : myHashSet) {
       System.out.printf("Set element - %s\n", element);
   }
// The output of the above loop is shown below:
//  Set element - Alice
//  Set element - Charlie
// Set element - Dave


  

