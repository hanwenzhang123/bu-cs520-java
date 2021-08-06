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

		// Close scanner
		scanner.close();
	}
}
