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
  
The sequence of primitive types by increasing range is shown below:
byte->short->int->long->float->double
  
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
double distanceTraveled, finalPosition;


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

//Precedence and Associativity
int finalPosition = initialPosition + speed * time;
double gpa = (grade1 + grade2 + grade3) / 3.0;
  
//Simple Input/Output
package cs520.module1.L2_datatypes;

import java.util.Scanner;

public class P01_ScannerInput {
    public static void main(String[] args) {
      System.out.print("What is your name? ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      System.out.println("Hello, " + input + "!");
    }
}
Scanner is found in the java.util package and must therefore be imported (line 1) before it may be used. 
  When this code is run, the console window allows the user to type their input, and it will not be sent to the program until the Enter key is pressed. 
  
  
The input data is always fed into the program as a string, even if the user enters only numeric data. 
Convert string to	    Parser method
byte                  Byte.parseByte()
short                 Short.parseShort()
int                   Integer.parseInt()
long                  Long.parseLong()
float                 Float.parseFloat()
double                Double.parseDouble()

  
Each parser method accepts a string value and converts it to the proper primitive type. This modified example converts the input text into an int so that it may then perform an addition operation:

package cs520.module1.L2_datatypes;

import java.util.Scanner;

public class P02_ParseStringInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter your age: ");
    String input = scanner.nextLine();
    int age = Integer.parseInt(input);
    int newAge = age + 10;
    String output = "You will be " + newAge + " in 10 years from now!";
    System.out.println(output);
  }
}

//Integer vs. Floating-Point Operations
package cs520.module1.L2_datatypes;

public class P03_MathTest {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int myInt = x / y;
        double myDouble1 = x / y;
        double myDouble2 = (double)x / (double)y;
        System.out.println(myInt);
        System.out.println(myDouble1);
        System.out.println(myDouble2);
    }
}
//1
//1.0
//1.5

//Initialization
int counter;
double totalSales;
int product;

//variable declaration
int counter = 1;
double totalSales = 2.3;
int product = 4;

//x only exist, within a method
public void doSomeMath() {
    int x;
    int y = x + 1;
}
//x is not a local variable and will default to 0 before it is added to 1 and assigned to y
int x;
public void doSomeMath() {
    int y = x + 1;
}

//Compound Assignment Operators
Frequently, a variable may be reassigned a value based on a computation involving itself. For example, counter = counter + 1;
will increase the value of counter by 1. This may be used for all arithmetic operations:
sum = sum + term;
product = product * factor;
quotient = quotient / divider;
remainder = remainder % 5;

Java provides a shorthand notation for this type of statement:
counter += 1;
sum += term;
product *= factor;
quotient /= divider;
remainder %= 5;
An arithmetic symbol ( +, -, *, /, % ) immediately followed by = in this manner is called a compound assignment operator. 

//Increment/Decrement Operators
It may be used to adds to the value of a variable by 1 by using the ++ notation, or to subtract from the value of a variable by 1 by using --. The increment/decrement operator has two forms:

Postfix form: ++ or -- after the variable name
Prefix form: ++ or -- before the variable name

int a = 5;
a++; // a is now 6
++a; // a is now 7
a--; // a is now 6
--a; // a is now 5

int a = 3;
int b = 4 * a++; // a is incremented after being multiplied by 4
System.out.println(a); // 4 is printed
System.out.println(b); // 12 is printed

int a = 3;
int b = 4 * ++a; // a is incremented before being multiplied by 4
System.out.println(a); // 4 is printed
System.out.println(b); // 16 is printed
   
