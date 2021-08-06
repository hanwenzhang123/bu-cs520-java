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

		// Close scanner
		scanner.close();
	}
}
