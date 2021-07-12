//Inheritance

//Class Hierarchies

//class & subclasses

Student.java
   // Derive the Student class from the Person class
   public class Student extends Person {
   }
Faculty.java
   // Derive the Faculty class from the Person class
   class Faculty extends Person {
   }
   
//Defining Constructors in Derived Classes
 the Student class has one private instance variable, program, and three constructors.
   // The default constructor
   public Student() {
           super();
           program = "Not Specified";
   }
   // Constructor with two arguments
 
public Student(String theName, String theId) {
           super(theName, theId);
           program = "Not specified";
}
   // Constructor with three arguments
   public Student(String theName, String theId, String theProgram) {
           super(theName, theId);
           program = theProgram;
}

   // Constructor with two arguments
   public Faculty(String theName, String theId) {
     super(theName, theId);
     title = "None";
     department = "Not specified";
}
   // Constructor with three arguments
   public Faculty(String theName, String theId, String theTitle) {
     super(theName, theId);
     title = theTitle;
     department = "Not specified";
}
   // Constructor with four arguments
   public Faculty(String theName, String theId, String theTitle, String dept) {
super(theName, theId);
title = theTitle;
     department = dept;
   }

//Defining Methods in Derived Classes
//Invoking Methods Defined in Superclasses
   super.caller()
     
//Private, Public and Protected Methods and Variables
private—the method could only be invoked by other methods within the same class.
public—the method could be invoked from any place, i.e., within the same class, from the subclasses, or from any other class that has a reference to the above class.
protected—the method is only accessible to methods within the same class and to the methods in the derived subclasses and to the methods in other classes in the same package.
default—the method is only accessible to methods within the same class and to the other classes in the same package.
  
//Abstract and Final Classes
An abstract class would then capture the common functionality to be supported among its derived classes. 
public abstract class Person {...}

No further classes could be derived from a final class. For example, an OnlineStudent class could be declared as a final class:
public final class OnlineStudent extends Student {...}

//Abstract and Final Methods
   public abstract class Student extends Person {
     public abstract double getHomeworkScore();
     public abstract double getExamScore();
     public double computeScore() {
       return 0.5 * getHomeworkScore() + 0.5 * getExamScore();
} }
 public final double computeScore() {
     return 0.5 * getHomeworkScore() + 0.5 * getExamScore();
}

//Interfaces
The interface only carries the signature of the methods. Implicitly, all the methods defined in the interface are abstract.

Shape.java
   interface Shape {
     public double area();
     public int compareTo (Shape s);
}

class Triangle implements Shape {
     private int base, height;
     public Triangle(int b, int h) {
       base = b;
       height = h;
}
     public double area() {
       return 0.5 * base * height;
}
     public int compareTo(Shape s) {
       double thisArea = area();
       double otherArea = s.area();
       if (thisArea < otherArea) {
         return -1;
       } else if (thisArea == otherArea) {
         return 0;
       } else {
         return 1;
} }
}

//Polymorphism
The class hierarchy allows programs to be written based on classes already developed and to provide proper framework for classes that could evolve in the future. 
  
//Method Invocations and Late Binding  
Person p;
// Assign an object to p
System.out.println(p.toString());

//Casting and instanceof Operator
public double computeStatistics(Person p) {
           if (p instanceof Student) {
                   // Return the student's computeScore
           } else if (p instanceof Faculty) {
                   // Return the faculty's computeSalary
} }

public double computeStatistics(Person p) {
        if (p instanceof Student) {
                Student s = (Student)p;
                return s.computeScore();
        } else if (p instanceof Faculty) {
                Faculty f = (Faculty)p;
                return f.computeSalary();
        } else
} }


