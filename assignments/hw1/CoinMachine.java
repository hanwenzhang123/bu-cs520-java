/**
 * CoinMachine.java (Assignment 1, Part 1)
 * @author Hanwen Zhang
 */

package cs520.hw1.part1;

import java.util.Scanner;	//import Scanner

public class CoinMachine{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	//use the scanner

		System.out.println("Enter # of pennies: ");
		String penniesInput = scanner.nextLine(); 

		System.out.println("Enter # of nickels: ");
		String nickelsInput = scanner.nextLine(); 

		System.out.println("Enter # of dimes: ");
		String dimesInput = scanner.nextLine(); 

		System.out.println("Enter # of quarters: ");
		String quartersInput = scanner.nextLine(); 

		double pennies = Double.parseDouble(penniesInput);	//parse string to double
		double nickels = Double.parseDouble(nickelsInput);
		double dimes = Double.parseDouble(dimesInput);
		double quarters = Double.parseDouble(quartersInput);

		double coins = pennies + nickels + dimes + quarters; //total coins

		double cents = (1 * pennies) + (5 * nickels) + (10 * dimes) + (25 * quarters);	//parenthesis easy to read but optional here since multiply goes first than plus

		double dollars = cents / 100;

		double fee = dollars * 0.12;

		double cash = dollars - fee;

		System.out.printf("You deposited %f coins totaling $%1.2f. %n", coins, dollars);	//%f - floating-point number, use for double here
		System.out.printf("The processing fee is $%1.2f. %n", fee);		//1 digit before decimal point and 2 digits after, start with a new line
		System.out.printf("You will receive $%1.2f in cash. %n", cash);

		scanner.close();	//close the scanner
	}

}
