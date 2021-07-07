Case Study – Prime Numbers
The program uses a separate method, isPrime(), to check if a given number is a prime.

public static boolean isPrime(int n) {
    // Rule out even numbers
    if (n % 2 == 0) {
      return false;
    }

    // Get upper limit for divisibility by getting
    // the square root of n; as Math.sqrt returns 
    // a value of type double, cast it to an int
    int limit = (int)Math.sqrt(n);

    // Check whether the given number is divisible by
    // any odd number up to the limit
    for (int i = 3; i <= limit; i = i + 2) {
      if (n % i == 0) {
        // Not a prime
        return false;
      }
    }
    // Is a prime
    return true;
}

The task is to compute the nth prime number. We can use a do statement to keep track of how many prime numbers have been found so far.
  The loop checks all the odd numbers 3, 5, 7, 9, 11, 13, … and calls the isPrime method for each:

public static int getNthPrime(int n) {
    // The first prime number is 2
    if (n == 1) {
      return 2;
    }
    
    int number = 1;
    int count = 1;

    // Loop until the nth prime is found
    do {
      number = number + 2;
      if (isPrime(number)) {
        count++;
      }
    } while (count < n);

    return number;
}

//full program
package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P12_PrimeNumberCaseStudy {

  public static boolean isPrime(int n) {
    // Rule out even numbers
    if (n % 2 == 0) {
      return false;
    }

    // Get upper limit for divisibility by getting
    // the square root of n; as Math.sqrt returns 
    // a value of type double, cast it to an int
    int limit = (int)Math.sqrt(n);

    // Check whether the given number is divisible by
    // any odd number up to the limit
    for (int i = 3; i <= limit; i = i + 2) {
      if (n % i == 0) {
        // Not a prime
        return false;
      }
    }
    // Is a prime
    return true;
  }

  public static int getNthPrime(int n) {
    // The first prime number is 2
    if (n == 1) {
      return 2;
    }
    
    int number = 1;
    int count = 1;

    // Loop until the nth prime is found
    do {
      number = number + 2;
      if (isPrime(number)) {
        count++;
      }
    } while (count < n);

    return number;
  }

  public static void main(String[] args) {
    // Ask the user for input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer (>= 1): ");
    String input = scanner.nextLine();

    // Convert to an integer
    int n = Integer.parseInt(input);

    // Call the method
    int result = getNthPrime(n);

    // Display the result
    System.out.println("The prime number is " + result);
  }
}
   
