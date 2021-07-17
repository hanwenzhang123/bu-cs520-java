/**
 * BankingProceduralStyle.java (Assignment 2, Part 1)
 * @author Hanwen Zhang
 */

package cs520.hw2.part1;

import java.lang.Math;	//import Math method

public class BankingProceduralStyle {

	public static void main(String[] args) {

		int initialDeposit = 5000;	//declare the variable

		double bankA = BankA(initialDeposit);	//call BankA method and stored the returned value to the variable bankA
		double bankB = BankB(initialDeposit);	//call BankB method and stored the returned value to the variable bankB

		if(bankA > bankB) {	//compare, if true, print out this statement, if not true go next one
			System.out.printf("BankA's CD exceeds BankB's CD by $%.2f.\n", (bankA-bankB));	//the value (bankA-bankB) will be displayed
		} else if (bankB > bankA) {	//compare, if true, print out this statement, if still not true, go to else
			System.out.printf("BankB's CD exceeds BankA's CD by $%.2f.\n", (bankB-bankA));	//the value (bankB-bankA) will be displayed
		} else {	//in case anything goes wrong or all above incorrect
			System.out.println("Error! Something went wrong!");
		}
    }

    public static double BankA(int initialDeposit){	//execute BankA method
		//declare variables
        double r = 0.04;
        int t = 3;

		//calculation - use the Math method we imported
        double finalValue = initialDeposit * (Math.pow((1 + r), t));

		//print out this statement when execute BankA
		System.out.printf("BankA %d-year CD of %d at %.2f%% rate is worth $%.2f.\n", t, initialDeposit, r * 100, finalValue);

		//return the result finalValue to the method
        return finalValue;
    }

    public static double BankB(int initialDeposit){	//execute BankB method
        //declare variables
		double r = 0.03;
        int t = 4;

		//calculation
        double finalValue = initialDeposit * (Math.pow((1 + r), t));

		//print out this statement when execute BankB
		System.out.printf("BankB %d-year CD of %d at %.2f%% rate is worth $%.2f.\n", t, initialDeposit, r * 100, finalValue);

		//return the result finalValue to the method
        return finalValue;
    }
}
/* output:
BankA 3-year CD of 5000 at 4.00% rate is worth $5624.32.
BankB 4-year CD of 5000 at 3.00% rate is worth $5627.54.
BankB's CD exceeds BankA's CD by $3.22.
*/
