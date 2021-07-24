The Map data structure is used to associate values with unique keys. 
Maps are not Lists or Collections but are often grouped with them. Think of a Map as a type of dictionary in which each word (key) has an associated definition (value).
  
  Only one value may be associated with any given key. 
  Given a particular key, the map structure provides a quick access to the associated value. 
  
The Map interface specifies the methods to insert keys and their values, to retrieve the value of the specified key, to check if a key is present and to remove a specified key/value pair from the map. 
  Other methods include a Set view of the keys in the map and a Collection view of the values in the map.
  
  //Map Implementations
The HashMap class provides a general-purpose implementation of the Map interface that does not guarantee the order of the entries that are placed in the map. 
  The class is used to associate values with their unique keys and to perform the various operations specified in the Map interface.
  
// Create an empty HashMap, defined as generic Map type on the left side
   Map<String, Integer> salaryMap = new HashMap<String, Integer>();
   // Put entries and values in the HashMap
   salaryMap.put("Alice", 50000);
   System.out.println("Map: " + salaryMap);
   salaryMap.put("Bob", 60000);
   System.out.println("Map: " + salaryMap);
   salaryMap.put("Charlie", 70000);
   System.out.println("Map: " + salaryMap);
   salaryMap.put("Dave", 80000);
   System.out.println("Map: " + salaryMap);

//   Map: {Alice=50000}
//    Map: {Bob=60000, Alice=50000}
//    Map: {Bob=60000, Alice=50000, Charlie=70000}
//    Map: {Bob=60000, Alice=50000, Charlie=70000, Dave=80000}
  

  // Look up Bob's salary
   int salary = salaryMap.get("Bob");
   System.out.printf("Bob's salary is $%d\n", salary);
// The output of the above statement is shown below:
//    Bob's salary is $60000
  
  
// Give Bob a 10% raise
   int newSalary = (int)(salary + (0.1 * salary));
   salary = salaryMap.put("Bob", newSalary);  //update, a new value for an existing key, the old entry is replaced by the new one.
   System.out.printf("Bob's new salary $%d replaces old salary $%d\n", newSalary, salary);
   System.out.println("Map: " + salaryMap);
// The output of the above statements is shown below. The map now contains the new value:
//    Bob's new salary $66000 replaces old salary $60000
//    Map: {Bob=66000, Alice=50000, Charlie=70000, Dave=80000}

  
// Check if a key exists within the map
   if (salaryMap.containsKey("Charlie")) {
       System.out.println("Charlie's entry is in the map");
   } else {
       System.out.println("Charlie's entry is not in the map");
   }
The output of the above statements is shown below:
   Charlie's entry is in the map
   Ed's entry is not in the map
  
  
// Access all of the keys in the map
   Collection<String> nameKeys = salaryMap.keySet();
   System.out.println(nameKeys);
   // Iterate over the keys in the map
   Iterator<String> nameIterator = nameKeys.iterator();
   while (nameIterator.hasNext()) {
       String name = nameIterator.next();
       System.out.printf("-- %8s's Salary is $%d\n", name, salaryMap.get(name));
}
// The output of the above code showing each key (the person’s name) and the associated salary is shown below:
//    --      Bob's Salary is $66000
//    --    Alice's Salary is $50000
//    --  Charlie's Salary is $70000
//    --     Dave's Salary is $80000


// Access all of the values in the map
   Collection<Integer> salaries = salaryMap.values();
   Iterator<Integer> salaryIterator = salaries.iterator();
   while (salaryIterator.hasNext()) {
       Integer value = salaryIterator.next();
       System.out.printf("-- Someone's Salary is $%d\n", value);
}
// The output of the above code showing each employee’s salary is shown below. However, the employees' names cannot be accessed using this approach.
//    -- Someone's Salary is $66000
//    -- Someone's Salary is $50000
//    -- Someone's Salary is $70000
//    -- Someone's Salary is $80000


// Remove a key from the map
   salary = salaryMap.remove("Bob");
   System.out.printf("Bob's entry with salary %d is removed\n", salary);
   System.out.println("Map: " + salaryMap);
// The output of the above code is shown below:
//    Bob's entry with salary 66000 removed
//    Map: {Alice=50000, Charlie=70000, Dave=80000}


// Iteration using the for-each construct
   for (String key : nameKeys) {
       System.out.printf("-- %8s's Salary is $%d\n", key, salaryMap.get(key));
   }
// The output of the above loop is shown below:
//    --    Alice's Salary is $50000
//    --  Charlie's Salary is $70000
//    --     Dave's Salary is $80000
  
