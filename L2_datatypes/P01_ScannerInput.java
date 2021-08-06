package cs520.module1.L2_datatypes;

import java.util.Scanner;

public class P01_ScannerInput {
	public static void main(String[] args) {
		System.out.print("What is your name? ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println("Hello, " + input + "!");
		
		// Close scanner
		scanner.close();
	}
}
