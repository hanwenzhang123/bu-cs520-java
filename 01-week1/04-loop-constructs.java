//Loop Constructs 
A loop is a programming tool that allows developers to repeat the same block of code until some condition is met.
The compiler first evaluates a boolean condition. If the condition is true, then the loop body is executed.
When the last line of the loop body is executed, the condition is re-evaluated. 
This process continues until the condition is false. 

//The while Statement
while (test) {
    statement(s)
}

The two components of the while statement are:
the test, a conditional expression which evaluates to true or false, and
the statement(s), which are executed as long as the test returns true.

//Example – The while Statement
int sum = 0;
int counter = 1;
while (counter <= n) {
  sum = sum + counter;
  counter = counter + 1;
}

//full program
package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P07_WhileSumOfFirstN {
  // Compute the sum of the first n numbers    
  public static int sumOfFirstN(int n) {

    int sum = 0;
    int counter = 1;
    
    while (counter <= n) {
      sum = sum + counter;
      counter = counter + 1;
    }
    
    return sum;
  }
  
  // The main method    
  public static void main(String[] args) {
    // Ask the user for input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer (>= 0): ");
    String input = scanner.nextLine();

    // Convert the input to an integer
    int n = Integer.parseInt(input);      
  
    // Call the method
    int result = sumOfFirstN(n);        
  
    // Display the result
    System.out.println("Sum of the first " + n + " numbers = " + result);
  }
}


//Loop Constructs – The for Statement
for (initial statements; test; final statements) {
  statement(s)
}

The four components of the for statement are:
the initial statements (optional)
the test, a conditional expression which evaluates to true or false
the final statements (optional)
the statement(s), which are executed as long as the test returns true.
  
int sum = 0;

for (int counter = 1; counter <= n; counter++) {
    sum = sum + counter;
}

//full program
package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P08_ForSumOfFirstN {
  // Method to compute the sum of the first n numbers  
  public static int sumOfFirstN(int n) {
    int sum = 0;
    
    for (int counter = 1; counter <= n; counter++) {
      sum = sum + counter;  
    }
    
    return sum;
  }
  
  // The main method
  public static void main(String[] args) {    
    // Ask the user for input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer (>= 0): ");
    String input = scanner.nextLine();

    // convert the input to an integer
    int n = Integer.parseInt(input);      
  
    // call the method
    int result = sumOfFirstN(n);        
  
    // Display the result
    System.out.println("Sum of the first " + n + " numbers = " + result);         
  }
}

//Loop Constructs – The do Statement
do {
	  statement(s)
} while (test);

The two components of the do statement are:
the statement(s), which are executed at least once
the test, a conditional expression that evaluates to true or false
  
int sum = 0;
int counter = 1;
do {
  sum = sum + counter;
  counter = counter + 1;
} while (counter <= n)
  
//full program  
package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P09_DoWhileSumOfFirstN {  
  // Method to compute the sum of the first n numbers  
  public static int sumOfFirstN(int n) {
    int sum = 0;
    int counter = 1;
  
    // Execute the code block repeatedly until counter is
    // no longer less than/equal to n
    do {
      sum = sum + counter;  
      counter = counter + 1;
    } while (counter <= n);
    
    return sum;
  }
  
  // The main method
  public static void main(String[] args) {
    // Ask the user for input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer (>= 0): ");
    String input = scanner.nextLine();
    
    // Convert the input to an integer
    int n = Integer.parseInt(input);      
  
    // Call the method
    int result = sumOfFirstN(n);        
  
    // Display the result
    System.out.println("Sum of the first " + n + " numbers = " + result);
  }
} 
  
//The break Statement
The loop constructs (while, for, and do) continue with the execution of the statements as long as their tests are true. 
  In some cases, within the loop, when certain conditions are met, the loop should be exited and the statement following the loop construct needs to be executed.
while (test1) {
	// statement1
	if (test2) {
		break;
	}
	// statement2
}
statement3
  
while (counter <= n) {
    product = product * counter;
    if (product >= max_value) {
        System.out.println("Max value reached: " + "The factorial of " +
            counter + " is " + product);
        // Break out of the loop
        break;
    }
    counter++;
}

//full program
package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P10_BreakExample {
  public static void productOfFirstN(int n, int max_value) {
    int counter = 1;
    int product = 1;

    while (counter <= n) {
      product = product * counter;
      if (product >= max_value) {
        System.out.println("Max value reached: " + "The factorial of " + counter + " is " + product);
        // Break out of the loop
        break;
      }
      counter++;
    }

    // When all the values up to n are used
    if (counter > n) {
      System.out.println("The factorial of " + n + " is " + product);
    }
  }

  public static void main(String[] args) {
    // Ask the user for input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer (>= 1): ");
    String input = scanner.nextLine();

    // Convert the input to an integer
    int n = Integer.parseInt(input);

    // Ask the user for the other input
    System.out.print("Enter the max value (>= 1): ");
    input = scanner.nextLine();

    // Convert to an integer
    int maxValue = Integer.parseInt(input);

    // invoke the method
    productOfFirstN(n, maxValue);
  }
}

//The continue Statement

while (test1) {
	// statements1
	if (test2) {
		continue;
	}
	// statements2
}
statement3

package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P11_ContinueExample {
  public static void pattern(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        if (col > row) {
          continue;
        }
        System.out.printf("%3d", col);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // Ask the user for input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer (>= 1): ");
    String input = scanner.nextLine();

    // Convert to an integer
    int n = Integer.parseInt(input);      
    
    // Invoke the method
    pattern(n);        
  }
}
  
