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
		System.out.println("and traveling with average speed of " + speed + " miles per hour");
		System.out.println("for " + time + " hours");
		System.out.println("the total distance traveled is " + distanceTraveled + " miles");
		System.out.println("and the final position reached is " + finalPosition);
		
		// Close scanner
		scanner.close();
	}
}