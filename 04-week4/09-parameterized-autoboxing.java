The parameterized type appears in < > brackets, for example:
List<String> myList = new ArrayList<String>();

This list can only contain member values of type String. Attempting to add non-String values to it would result in a compiler error.
  
  
  Iterator<String> iterator = myList.iterator(); while (iterator.hasNext()) {
       String s = iterator.next();
       System.out.println(s.length);
   }

 package cs520.module4.L3_types;
   import java.util.ArrayList;
   import java.util.Iterator;
   import java.util.List;
   public class P02_ParameterizedTypes {
       public static void main(String[] args) {
           List<String> myList = new ArrayList<String>();
           myList.add("I'm a String 1");
           myList.add("I'm a String 2");
           myList.add("I'm a String 3");
           // Uncomment the next line to see that the compiler will disallow
           // adding values that are not of type String
           //myList.add(new Employee());
           // Iterator is also created with the <String> type
           Iterator<String> iterator = myList.iterator();
           while (iterator.hasNext()) {
               // iterator.next() will only return Strings
               String s = iterator.next();
               // Do something that only Strings can do
               System.out.println(s.length());
} }
}


This is not to say that data structures may not contain values of various types. 
  To do so, it is preferable to define the structure with <Object> as the parameterized type rather than omitting it.
  
Parameterized types are not restricted to lists and sets. 
    Maps should also always use parameterized types. As Map must always be declared with both a key and a value, a specific type is needed for each, separated by a comma. 
  
      
Map<String, Employee> myMap = new HashMap<String, Employee>(); 
myMap.put("Employee 1", new Employee("Alice"));
 
  
//Autoboxing

// How things used to be done before parameterized types and autoboxing
   List myList = new ArrayList();
   myList.add(new Integer(5)); // Could not add raw primitive
   Integer myInteger = (Integer)myList.get(0);
   int myInt = myInteger.intValue();
   System.out.println(myInt + " * 10 = " + (myInt * 10));


//The introduction of autoboxing allowed primitives to be used directly rather than wrapping them, allowing some degree of interchangeability:
   // With parameterized types and autoboxing
   List<Integer> myList2 = new ArrayList<Integer>();
   myList2.add(5); // Add raw primitive
   System.out.println(myList2.get(0) + " * 10 = " + (myList2.get(0) * 10));


No casting or reduction of a wrapper class type to a primitive type is required. However, note that the list cannot be defined as List<int>; the backing class type is still necessary.
  
