In object-oriented programming, each object is an instance of the respective class. 
  Each object has its own data as captured by the instance variables. 
  The rest of the class definition consists of various methods. 
  Some of these methods are used for accessing the instance data and for modifying the same.
    
//The private data members are only accessible to the methods that are declared within the same class.
//ince these methods do not return a value, the return type of these methods is declared as void.
    
public class P01_Employee {
private String name;
     private int startingSalary;
     private double timeEmployed;
     public void setName(String name) {
       this.name = name;
}
     public void setStartingSalary(int value) {
       this.startingSalary = value;
}
     public void setTimeEmployed(double value) {
       this.timeEmployed = value;
}
     public String getName() {
       return this.name;
}
     public int getStartingSalary() {
       return this.startingSalary;
}
     public double getTimeEmployed() {
       return this.timeEmployed;
}
     public double getCurrentSalary() {
       double result = this.startingSalary + this.startingSalary * 0.04 *
         this.timeEmployed;
       return result;
}
     public void printEmployeeData() {
       System.out.println("Employee " + this.name +
         "\n started with a salary of $" + this.getStartingSalary() + "\n" +
         this.getTimeEmployed() + " years ago and has a" +
         "\n current salary of $" + this.getCurrentSalary());
} }

//Creating Objects
Once the class is defined capturing the data members (the state) and the methods (the behavior), instances of the class (the objects) are now created. 
  
public class P01_EmployeeTest {
  public static void main(String[] args) {
   // Create an employee
   P01_Employee e1 = new P01_Employee();
   // Display the employee
   e1.printEmployeeData();
    
    // Create another employee
   P01_Employee employee2 = new P01_Employee();
   // Set employee data
   employee2.setName("Alice");
   employee2.setStartingSalary(50000);
   employee2.setTimeEmployed(2);
   // Display the employee
   employee2.printEmployeeData();
  } 
}  


//Constructors
The implicit default constructor creates the object and initializes all the instance data members to their default values (numeric types to 0, class types to null, boolean types to false, etc.)
  
// Default Constructor
public P02_Employee() {
}
// Constructor with one argument - name
public P02_Employee(String name) {
}
// Constructor with two arguments
// - name and starting salary
public P02_Employee(String name, int startingSalary) {
}
// Constructor with three arguments
// - name, starting salary, and time employed
public P02_Employee(String name, int startingSalary, double timeEmployed) {
}
  
//The explicit default constructor is the constructor with no arguments.  
public class P02_Employee {
           // Employee data stored in fields or instance variables
           private String name;
           private int startingSalary;
           private double timeEmployed;
           // Default constructor
           public P02_Employee() {
                   name = "Unknown";
                   startingSalary = 50000;
                   timeEmployed = 0;
}
  

   // Create an employee using default constructor
   P02_Employee e1 = new P02_Employee();
   // Display the employee
   e1.printEmployeeData();
  
  // Constructor with two arguments
   public P02_Employee(String name, int startingSalary) {
           this(name, startingSalary, 0.0);
}
   // Constructor with three arguments
   public P02_Employee(String name, int startingSalary, double timeEmployed) {
           this.name = name;
           this.startingSalary = startingSalary;
           this.timeEmployed = timeEmployed;
}

  // Create another employee with a name and salary
   P02_Employee e3 = new P02_Employee("Bob", 60000);
   // Display the employee
   e3.printEmployeeData();
   // Create another employee with a name, salary and time employed
   P02_Employee e4 = new P02_Employee("Charlie", 70000, 2);
   // Display the employee
   e4.printEmployeeData();
 
  
//Reusing Constructors
The specified arguments are set as the instance data and the default values are used for the rest. 
  To avoid duplicating the code across various constructors, the constructor with all the arguments is fully specified. 

   // Default Constructor
   public P03_Employee() {
 this("Unknown", 50000, 0);
}
   // Constructor with one argument
   public P03_Employee(String name) {
           this(name, 50000, 0);
}
   // Constructor with two arguments
   public P03_Employee(String name, int startingSalary) {
           this(name, startingSalary, 0);
}
   // Constructor with three arguments
   public P03_Employee(String name, int startingSalary, double timeEmployed) {
           this.name = name;
           this.startingSalary = startingSalary;
           this.timeEmployed = timeEmployed;
}
  
  
//Comparing Objects
// Check if two employee instances are equal
public boolean equals(P04_Employee other) {
           if ((this.startingSalary == other.startingSalary) &&
               this.timeEmployed == other.timeEmployed)) {
                   return true;
           } else {
                   return false;
} }
P04_Employee e1 = new P04_Employee("Alice", 70000, 2);
   P04_Employee e2 = new P04_Employee("Bob", 70000, 2);
   if (e1.equals(e2)) {
           System.out.println(e1.getName() + " and " + e2.getName() + " are equal");
}
 
  
//Static Variables and Methods
  
  
  
  
  
  
  
  
  
