//Scanner
import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name? ");
    String name = scanner.nextLine();   //input as string
//  int name = scanner.nextInt();   //input as int
    System.out.println("Hello, " + name);
    System.out.printf("Hello, %s%n Your age is %d years old", name, 25);  //printf is for formatted print, using ',' instead of '+'
  }
}

//Formatted Output
printf - printmethod
printf("%d", 10); (formatting string, data or argument(s) to be printed as long as it is the same data type

Example:
  String name = "John";
  int classes = 5;
  double gpa = 3.5;
  System.out.printf("Hello, %s.%nYou are taking %d classes.%nYour GPA is %f.", name, classes, gpa);
                   
Output:
 Hello, John.
 You are taking 5 classes.
 Your GPA is 3.5000000.

%s - string
%d - digit
%f - floating-point number (decimal)
%n - new line
%c - lower case character
%C - upper case character
%s - lower case string
%S - upper case string
%b - boolean (it will calculate, it is true then true, false then false, null is false, a string is true)
%e - scientific notation, capital E then with capital
%g - decimal point or computerized scientific notation
%o - octal based, 8, (%x, 10) //12
%x - hexidecimal based, 16, (%x, 10) //a
%h - hashed (%h, "hello") //5e918d2
%a - hexidecimal with decimal points
%8.2f\n - 8 digit wide with 2 digits after decimal point with a new line
 
