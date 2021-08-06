package cs520.module1.L2_datatypes;

import java.util.Scanner;

public class P02_ParseStringInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		String input = scanner.nextLine();
		int age = Integer.parseInt(input);
		int newAge = age + 10;
		String output = "You will be " + newAge + " in 10 years from now!";
		System.out.println(output);

		// Close scanner
		scanner.close();
	}
}
