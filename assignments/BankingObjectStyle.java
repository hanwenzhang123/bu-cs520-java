/**
 * BankingObjectStyle.java (Assignment 2, Part 2)
 * @author Hanwen Zhang
 */

package cs520.hw2.part2;

public class BankingObjectStyle {

	public static void main(String[] args) {
		//instantiate two objects of the type BankCD
		BankCD bank1CD = new BankCD("BankA");
		BankCD bank2CD = new BankCD("BankB");

		//use setters to update other variable values associated with BankA
		bank1CD.setInitialDeposit(5000);
		bank1CD.setRate(0.04);
		bank1CD.setNumberOfYears(3);

		//use setters to update other variable values associated with BankB
		bank2CD.setInitialDeposit(5000);
		bank2CD.setRate(0.03);
		bank2CD.setNumberOfYears(4);

		//Print the details of the two objects
		bank1CD.printCDDetails();	//BankA 3-year CD of 5000 at 4.00% rate is worth $5624.32.
		bank2CD.printCDDetails();	//BankB 4-year CD of 5000 at 3.00% rate is worth $5627.54.

		//Invoke the getFinalValue() method for comparing the two.
		double bank1Value = bank1CD.getFinalValue();
		double bank2Value = bank2CD.getFinalValue();

		// using the Java built-in method .compare(x, y)
		// 0: if (x==y)
		// -1: if (x < y)
		// 1: if (x > y)
		int comparison = Double.compare(bank1Value, bank2Value);

		//compare the return value in a switch statement
		switch (comparison) {
			case 1:
				double xGreater = bank1Value-bank2Value;
				System.out.printf("BankB's CD exceeds BankA's CD by $%.2f.\n", xGreater);
				break;
			case -1:	//this will be true: BankB's CD exceeds BankA's CD by $3.22.
				double yGreater = bank2Value-bank1Value;
				System.out.printf("BankB's CD exceeds BankA's CD by $%.2f.\n", yGreater);
				break;
			case 0:
				System.out.println("You will get an equal amount of money when the CD matures.");
				break;
			default:
				System.out.println("Error! Something went wrong!");	//just be cautious, most likely won't happen
				break;
		}
	}

}
/* output:
BankA 3-year CD of 5000 at 4.00% rate is worth $5624.32.
BankB 4-year CD of 5000 at 3.00% rate is worth $5627.54.
BankB's CD exceeds BankA's CD by $3.22.
*/