package cs520.module3.L2_exceptions;

import java.util.Scanner;

public class P01_Exceptions {
	public static void main(String[] args) {
		try {
			// Prompt the user for numeric input
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number: ");
			String input = scanner.nextLine();

			// Convert the string input to an integer;
			// if the string doesn't contain a number,
			// a NumberFormatException will be thrown
			int value = Integer.parseInt(input);
			int result = value * value;
			System.out.printf("The square of %d is %d\n", value, result);
			
			// Uncomment the following lines to trigger a NullPointerException
			String s = null;
			
			s.trim();
			
			// Uncomment the following lines to trigger a StringIndexOutOfBoundsException
			//String s = "abc";
			//String x = s.substring(20);

			// Close scanner
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Sorry!");
		}
	}
}
