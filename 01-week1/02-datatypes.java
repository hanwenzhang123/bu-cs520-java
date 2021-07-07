//Variables
A variable or an object is characterized by its:

type, which determines the memory size allotted to the object and how to interpret the memory bits to obtain the object value,
name, which allows accessing the object value currently stored in memory
value, which is the representation of the current contents of the variable

Java is a strongly typed language, which means that variable types must always be assigned and variables may only hold values of the declared type. 
  
//Identifiers
A variable name, known as an identifier, is defined as a sequence of letters, digits and the underscore symbol (_). An identifier must not begin with a digit.
  Java is case-sensitive in that it considers the lower and upper case of a given letter as two different symbols
  Java identifiers are typically named using "camel case"; they begin with a lowercase letter and word boundaries are indicated with a uppercase letter

//Primitive Data Types and Literals
Character constants (char primitive type) are single characters enclosed in single quotes, such as:
'c', 'x', '5', '&'
String constants, which we have already seen in previous examples, are enclosed in double quotes, such as:
"Welcome to Java"
"Programming is fun and a lot of work"
The preferred type for integers (whole numbers) is int, with literals in the familiar positive or negative integer form:
788, 1024, 566, -100, 0
Constants of type long are differentiated from int constants by appending a suffix of '1' or 'L', for example:
123456789L or 1234567891
The uppercase 'L' is preferred because the lower case '1' can be confused with the digit '1' in some fonts.
A common type used for floating-point, or decimal, values is double. Literals of type double can be written as decimals, with or without a 'd' or 'D' suffix:
2.73,  3.1415,  2.73d,  3.1415D,  -123.45
or in exponential notation, also known as scientific notation, sun as:
2.73e-2,   3.1415e-4,   .5e3
which is equivalent to:
273*10-2, 31415*10-4, .5*10-4 respectively.
Constants of type float are differentiated from double constants by appending a suffix of 'f' or 'F'.
  
//Type Casts
syntax cast expression:
(target_type) value_of_source_type

The following statement is legal: double a = 17;

transformations to a smaller value range are illegal: int a = 17.5; (possible loss of precision)

int a = (int)17.9;	Convert floating-point  17.9 to int 17  (int)17.9;  
byte a = (byte)17.9;	Convert floating-point  17.9 to byte 17	(byte)17.9;
char c = (char) 7;	converts integer  7 to char 7	(char) 7;

When a floating-point variable is converted to an integer type, its decimal portion is simply truncated, not rounded, so (int)17.9 would resolve to 17, not 18.
The cast operation is always performed before any arithmetic expressions are executed on the variable.
  
//Variable Declarations
Syntax: type variableName1, variableName2;

int index, counter1, counter2;
double acceleration, speed, time;
 

//Expressions and Assignment Statements
package cs520.module1.L2_datatypes;

import java.util.Scanner;

public class P01_ComputingDistance {
  public static void main(String[] args) {

    // Create the scanner object instance for user input 
    Scanner scanner = new Scanner(System.in);

    // Get initial position
    System.out.print("Enter initial position: ");
    String input = scanner.nextLine();
    double initialPosition = Double.parseDouble(input);

    // Get hours
    System.out.print("Enter time in hours: ");
    input = scanner.nextLine();
    double time = Double.parseDouble(input);

    // Get MPH
    System.out.print("Enter speed in miles per hour: ");
    input = scanner.nextLine();
    double speed = Double.parseDouble(input);

    // Compute final position
    double distanceTraveled = speed * time;
    double finalPosition = initialPosition + distanceTraveled;

    // Output results
    System.out.println();
    System.out.println("Starting from initial position " + initialPosition);
    System.out.println("and traveling with average speed of " + speed + 
        " miles per hour");
    System.out.println("for " + time + " hours");
    System.out.println("the total distance traveled is " + distanceTraveled +
        " miles");
    System.out.println("and the final position reached is " + finalPosition);
    
  }
}

  
  
  
