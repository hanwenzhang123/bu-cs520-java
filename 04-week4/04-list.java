The List interface extends the Collection interface and represents an ordered collection of elements. 
  A list can contain duplicate elements and can insert and retrieve elements by a given index position in the list. 
  
//List Implementations
Java provides two general-purpose List implementations: the ArrayList class and the LinkedList class. 
ArrayList provides a resizable array implementation of the List interface. 
  The ArrayList implementation is used when the addition and removal of elements are performed at the end of the list. 
  Insertion into and removal from an ArrayList at arbitrary positions are expensive operations, as the elements are shifted in the internal data structure.
  
LinkedList provides a slightly different implementation of the List interface that provides efficient insertion and removal operations.
  
//ArrayList
// Create an empty list of String objects
 List<String> nameList = new ArrayList<String>();
 System.out.printf("Initial size = %d\n", nameList.size());
 // Add elements to the list (in this case String objects)
 nameList.add("Alice");
 System.out.println("List: " + nameList);
 nameList.add("Bob");
 System.out.println("List: " + nameList);
 nameList.add("Charlie");
 System.out.println("List: " + nameList);
 nameList.add("Dave");
 System.out.println("List: " + nameList);
 nameList.add("Ed");
 System.out.println("List: " + nameList);
 System.out.printf("Size = %d\n", nameList.size());

System.out.println("Customized list printing:");
   for (int i = 0; i < nameList.size(); i++) {
       System.out.printf("Index: %d, Element: %s\n", i, nameList.get(i));
}
// The output of the above statement is shown below:
//    Customized list printing:
//    Index: 0, Element: Alice
//    Index: 1, Element: Bob
//    Index: 2, Element: Charlie
//    Index: 3, Element: Dave
//    Index: 4, Element: Ed

System.out.println("For-Each Loop:");
   for (String element : nameList) {
       System.out.printf(" Element: %s\n", element);
}
// The output of the above statements is shown below:
//    For-Each Loop:
//    Element: Alice
//    Element: Bob
//    Element: Charlie
//    Element: Dave
//    Element: Ed
  
  
// Remove Bob from the list
   System.out.println("Removing Bob from the list");
   nameList.remove("Bob");
   System.out.printf("Size = %d\n", nameList.size());
   System.out.println("List: " + nameList);
   System.out.printf("Element at position 1 = %s\n", nameList.get(1));

// The output of the above statements is shown below:
//    Removing Bob from the list
//    Size = 4
//    List: [Alice, Charlie, Dave, Ed]
//    Element at position 1 = Charlie
  
The indexOf() method finds the index of the specified element within the list:
   // Find the index of Charlie in the list
   int index = nameList.indexOf("Charlie");
   System.out.printf("Index of Charlie = %d\n", index);

With the index known, the code could then remove the element at that index from the list:
   // Remove element at the above index
   String oldElement = nameList.remove(index);
   System.out.printf("Element %s at index %d is removed\n", oldElement, index);
   System.out.printf("Size = %d\n", nameList.size());
   System.out.println("List: " + nameList);

// The output of the above statements is shown below:
//    Index of Charlie = 1
//    Element Charlie at index 1 is removed
//    Size = 3
//    List: [Alice, Dave, Ed]
  
  
//ArrayList of Custom Objects
public class Employee {
       private String employeeId;
       private String employeeName;
       private int employeeSalary;
       // Constructor
       public Employee(String id, String name, int salary) {
           employeeId = id;
           employeeName = name;
           employeeSalary = salary;
}
       // Get methods (set methods not implemented)
       public String getEmployeeId() {
           return employeeId;
       }
       public String getEmployeeName() {
           return employeeName;
}
       public int getEmployeeSalary() {
           return employeeSalary;
}
       public String toString() {
           return String.format("(%s, %s, %s)", employeeName, employeeId, employeeSalary);
           }
}


// System.out.println("Customized list printing:");
//    for (int i = 0; i < employeeList.size(); i++) {
//        System.out.printf(" Index: %d, Element: %s\n", i,
//        employeeList.get(i));
// }
// System.out.println("For-Each Loop:");
//    for (Employee element : employeeList) {
//        System.out.printf(" Element: %s\n", element);
// }
// The output of the above code is shown below:
//    Customized list printing:
//    Index: 0, Element: (Alice, ID1, 51000)
//    Index: 1, Element: (Bob, ID2, 52000)
//    Index: 2, Element: (Charlie, ID3, 53000)
//    Index: 3, Element: (Dave, ID4, 54000)
//    Index: 4, Element: (Ed, ID5, 55000)
//    For-Each Loop:
//    Element: (Alice, ID1, 51000)
//    Element: (Bob, ID2, 52000)
//    Element: (Charlie, ID3, 53000)
//    Element: (Dave, ID4, 54000)
//    Element: (Ed, ID5, 55000)


   import java.util.ArrayList;
   import java.util.List;
   public class P02_ArrayListEmployeeDemo {
       public static void main(String[] args) {
           List<Employee> employeeList = new ArrayList<Employee>();
           System.out.println("Initial size = " + employeeList.size());
// Add elements to the list (in this case Employee objects)
employeeList.add(new Employee("ID1", "Alice", 51000));
           System.out.println("List: " + employeeList);
           employeeList.add(new Employee("ID2", "Bob", 52000));
           System.out.println("List: " + employeeList);
           employeeList.add(new Employee("ID3", "Charlie", 53000));
           System.out.println("List: " + employeeList);
           employeeList.add(new Employee("ID4", "Dave", 54000));
           System.out.println("List: " + employeeList);
           employeeList.add(new Employee("ID5", "Ed", 55000));
           System.out.println("List: " + employeeList);
           System.out.println("Size = " + employeeList.size());
           System.out.println("Customized list printing:");
           for (int i = 0; i < employeeList.size(); i++) {
               System.out.printf(" Index: %d, Element: %s\n", i, employeeList.get(i));
}
           System.out.println("For-Each Loop:");
           for (Employee element : employeeList) {
               System.out.printf(" Element: %s\n", element);
} }
}

    
