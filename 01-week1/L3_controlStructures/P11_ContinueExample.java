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

		// Close scanner
		scanner.close();
	}
}
