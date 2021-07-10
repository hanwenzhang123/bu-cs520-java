MyProgram.java (file name.file extension)
javac MyProgram.java (Java Compiler javac)
MyProgram.claass
java MyProgram (Java Virtual Machine JVM java)

Source code in Java - a high level computer language
Object code in Java byte code - an intermediate language
The JVM interpreter translates object code into machine code and executes machine code

//example
package cs520.module1.L1_intro;

public class P01_Welcome {    //single class called P01_Welcome, public - the class is visible to other classes in our application

    public static void main(String[] args) {  //a single method called main(), main() method must be declared, will be automatically called by the JVM when the program runs

        // Display a greeting in the console window
        System.out.println("Welcome to Java!");   //string 
        System.out.println("Computers are great at arithmetic");
        int a = 11; //All variables in a Java program must also be defined using a type.
        int b = 22; //the keyword int is a built-in Java variable type that means that variables of type int will contain integer (whole number) data only.
        int sum = a + b;
        System.out.println("The sum of " + a + " + " + b + " is " + sum); //+ sign joins multiple strings

    } //System.out.println(...) - the println() method is called on the out object of the System class that accepts arguments, or input data fed into the method

}
/* this is a comment that stretches_over_multiple_lines
Welcome to Java!
Computers are great at arithmetic
The sum of 11 + 22 is 33
*/

Thus our class is contained within a file called P01_Welcome.java, and when it is compiled, a file called P01_Welcome.class will be automatically generated.
   
