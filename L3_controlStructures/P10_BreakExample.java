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

		// Close scanner
		scanner.close();
	}
}
