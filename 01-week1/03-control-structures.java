//The if Statement
if (test) {
    statements
}

if (test)
    statement

There are two parts to the if statement:
The condition being tested
The statement(s) to be executed only when that condition is true

if (age >= 18) {
	// Condition was true
	System.out.println("You are old enough to vote");
}

//full program
import java.util.Scanner;

public class P01_IfAgeTest {

    public static void main(String[] args) {

        System.out.print("What is your age? ");

        // Create Scanner to solicit user input
        Scanner scanner = new Scanner(System.in);

        // Read input into a String variable when Enter is pressed
        String input = scanner.nextLine();

        // Convert the String input into an integer
        int age = Integer.parseInt(input);
        // Call the checkVotingAge() method
        checkVotingAge(age);
    }

    public static void checkVotingAge(int age) {

        // Perform conditional test using the value of age
        if (age >= 18) {
            // Condition was true
            System.out.println("You are old enough to vote");
        }

    }
}

//The if-else Statement
if (test) {
    statements
} else {
    statements
}

There are three parts to the if-else statement:
The condition being tested
The statement(s) to be executed only when that condition is true
The statement(s) to be executed only when that condition is false
  
// Perform conditional test using the value of age
    if (age >= 18) {

      // Condition was true
      System.out.println("You are old enough to vote");

    } else {

      // Condition was false
      int waitFor = 18 - age;
      System.out.println("Sorry, you are not old enough to vote.");
      System.out.println("You have to wait " + waitFor + " years.");

    }
  

//full program

package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P02_IfElseAgeTest {

  public static void main(String[] args) {

    System.out.print("What is your age? ");

    // Create Scanner to solicit user input
    Scanner scanner = new Scanner(System.in);

    // Read input into a String variable when Enter is pressed
    String input = scanner.nextLine();

    // Convert the String input into an integer
    int age = Integer.parseInt(input);

    // Call the checkVotingAge() method
    checkVotingAge(age);

  }

  public static void checkVotingAge(int age) {

    // Perform conditional test using the value of age
    if (age >= 18) {

      // Condition was true
      System.out.println("You are old enough to vote");

    } else {

      // Condition was false
      int waitFor = 18 - age;
      System.out.println("Sorry, you are not old enough to vote.");
      System.out.println("You have to wait " + waitFor + " years.");

    }
  }
}

The user is queried for an age value and will see a message such as this if the age is less than 18:
	What is your age? 12
	Sorry, you are not old enough to vote. 
	You have to wait 6 years.
    
//  Comparison Operators
expression comparison_operator expression
    
>	Greater than
<	Less than
==	Equals
!=	Not equals
<=	Less than or equal to
>=	Greater than or equal to

Expression	Description
x > y	True if the value of x is greater than the value of y.
(2 * x + 5) < y	True if twice the value of x plus 5 is less than y.
3 * x == 2 * y	True if thrice the value of x is the same as 2 times the value of y.
w == 'A'	True if w is equal to the character symbol 'A'.
z == false	True if the value of z is false.
x != 3 * y	True if the value of x is not equal to thrice the value of y.
  
It is important to know the distinction between single (=) and double equals (==) operators. 
  The single equals sign is an assignment operator; for example, x = 5 sets the value of x to 5. 
  The double equals sign is an equality test; for example, x == 5 results in a boolean value based on the comparison of x to 5.
    
//Combining Boolean Expressions

&&	Logical and
||	Logical or
!	Logical not
    
expr1	expr2	expr1 && expr2	expr1 || expr2
false	false	    false	          false
false	true	    false         	true
true	false	    false	          true
true	true	    true	          true 

expr	!(expr)
false	true
true	false
    
    
//Example – Boolean Expressions
package cs520.module1.L3_controlStructures;

public class P03_PairOfDice {
  public static void rollDice() {
    // Generate a random value for the first die
    int face1 = 1 + (int)(Math.random() * 6);
    // Generate a random value for the second die
    int face2 = 1 + (int)(Math.random() * 6);
    // Create the message that will be displayed
    String result = "[" + face1 + "][" + face2 + "]";
    // Check whether this is a jackpot
    if ((face1 == face2) || (face1 == 2 * face2) || (face2 == 2 * face1)) {
      result = result + " Jackpot!!";
    } else {
      result = result + " Better luck next time";
    }

    System.out.println(result);
  }

  public static void main(String[] args) {
    // Invoke the method
    rollDice();
  }
}

//Generating Random Values
- double x = 6 * Math.random();
Generates a random value (double) between 0.0 and 6.0 (0.0 - 5.99999...)
- int y = (int)x;
Converts to an integer, ignoring the decimal portion; this will yield an integer between 0 and 5
- y++;
Adds 1 to produce a result between 1 and 6
  
Or more succinctly:
int y = (int)((6 * Math.random()) + 1);


//Multiple Conditional Statements
import java.util.Scanner;

public class P04_FedTax {

    // Method to compute the taxes            

    private static double computeTax(int income) {
        double tax = 0.0;                
        // Compute the tax as per the tax rate
        if ( (income > 0) && (income <= 8700) ) {
            tax = 0.1 * income;
        } else if ( (income > 8700) &&(income <= 35350) ) {
            tax = 870.00 + 0.15 * (income - 8700);
        } else if ( (income > 35350) && (income <= 85650) ) {
            tax = 4867.50 + 0.25 * (income - 35350);
        } else if ( (income > 85650) && (income <= 178650) ) {
            tax = 17442.50 + 0.28 * (income - 85650);
        } else if ( (income > 178650) && (income <= 388350) ) {
            tax = 43482.50 + 0.33 * (income - 178650);
        } else if (income > 388350) {
            tax = 112683.50 + 0.35 * (income - 388350);
        }
        // Round to the nearest dollar
        tax = Math.round(tax);

        return tax;                                

    }    

    public static void main(String[] args) {

        // Get user input
        System.out.print("Enter your taxable income (dollars only): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Parse the input to an integer
        int taxableIncome = Integer.parseInt(input);

        // Invoke the computeTax() method
        double result = computeTax(taxableIncome);    

        // Display the result
        System.out.println("Tax: $" + result);

    }
}

//The switch Statement - The switch keyword begins a special form of the if statement.

String result;

if (day == 1) {
	result = "Monday";
} else if (day == 2) {
	result = "Tuesday";
} else if (day == 3) {
	result = "Wednesday";
} else if (day == 4) {
	result = "Thursday";
} else if (day == 5) {
	result = "Friday";
} else if (day == 6) {
	result = "Saturday";
} else if (day == 7) {
	result = "Sunday";
} else { 
	result = "Error";
}

String result;

switch (day) {
	case 1:
		result = "Monday";
		break;
	case 2:
		result = "Tuesday";
		break;
	case 3:
		result = "Wednesday";
		break;
	case 4:
		result = "Thursday";
		break;
	case 5:
		result = "Friday";
		break;
	case 6:
		result = "Saturday";
		break;
	case 7:
		result = "Sunday";
		break;
	default:
		result = "Error";
		break;
}

//full program
package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P06_SwitchExample {

    public static String dayToString(int day) {
        String result;
        switch (day) {
          case 1:
            result = "Monday";
            break;
          case 2:
            result = "Tuesday";
            break;
          case 3:
            result = "Wednesday";
            break;
          case 4:
            result = "Thursday";
            break;
          case 5:
            result = "Friday";
            break;
          case 6:
            result = "Saturday";
            break;
          case 7:
            result = "Sunday";
            break;
          default:
            result = "Error";
            break;
        }

        return result;
    }

    public static void main(String[] args) {
        // Create Scanner to gather user input
        Scanner scanner = new Scanner(System.in);

        // Read input into a String variable when Enter is pressed
        System.out.print("Enter a day number (1-7): ");
        String input = scanner.nextLine();

        // Convert the String input into an integer
        int day = Integer.parseInt(input);

        // Invoke the method
        String value = dayToString(day);

        // Display the result
        System.out.println("It is " + value);
    }
}

//optional
switch (day) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		result = "Weekday";
		break;
	case 6:
	case 7:
		result = "Weekend";
		break;
	default:
		result = "Error";
		break;
}
 
