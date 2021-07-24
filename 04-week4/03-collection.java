The following interfaces provide operations on groups of objects: Collection, List, Set, Queue, Deque and Map. 
Some of the classes implementing these interfaces are ArrayList, LinkedList, HashSet, Stack, ArrayDeque and HashMap. 
  
The Collection interface is the root interface of the collection hierarchy. 
A Collection represents a group of objects. These are known as the elements of the collection.
  
Arrays vs. Collections
Arrays are normally used when the number of elements is known in advance.
Arrays provide direct access to the elements stored in the data structure. 
  However, insertion, removal, and lookup of objects in the array are not straightforward operations. 
  
The classes in the Collection hierarchy are used when the number of elements varies during the lifetime of the application. 
  They also provide operations for insertion, removal, and lookup of objects.
    
//Polymorphic Variable Declaration
List<String> nameList = new ArrayList<String>();

The general advice is to be as generic as possible on the left side and as specific as necessary on the right side.
Because java.util.List is a subclass of java.util.Collection , we could try to be even more generic on the left side: Collection<String> nameList = new ArrayList<String>();

Collection<String> nameList = new ArrayList<String>();
  
  
