/**
 * Looping.java (Assignment 1, Part 2)
 * @author Hanwen Zhang
 */

package cs520.hw1.part2;

import java.util.Scanner;	//import Scanner

public class Looping {

	public static void main(String[] args) {
		String input;	//declare variable
		int total = 0;	//declare variable
		Scanner scanner = new Scanner(System.in);	//use the scanner

		for (int number=1; number<=3; number++) {	//while we can always use i, j, but here we use number as loop iteration
			System.out.println("Please enter value #" + number + " :");
			input = scanner.nextLine(); 	//we already declare the datatype at the beginning so here we just assign the value
			int inputNumber = Integer.parseInt(input);	//parse the string to integer
			total += inputNumber;	//add to the total that the variable we have declared
		}

		System.out.printf("Total: %d %n", total);	//print out total and move to next line

		if(total < 100) {
			System.out.println("It is under 100");
		} else if ((total >= 100) && (total < 200)) {
			System.out.println("It is between 100 and 200");
		} else if (total >= 200) {
			System.out.println("It is above 200");
		} else {		//just in case the above test failed, optional here
			System.out.println("Error!");	//optional, the program most likely not going to fail
		}
		
		scanner.close();	//close the scanner
	}
}
