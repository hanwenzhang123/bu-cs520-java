package cs520.module1.L3_controlStructures;

import java.util.Scanner;

public class P04_FedTax {

    // Method to compute the taxes            

    private static double computeTax(int income) {
        double tax = 0.0;                
        // Compute the tax as per the tax rate
        if ( (income > 0) && (income <= 8700) ) {
            tax = 0.1 * income;
        } else if ( (income > 8700) && (income <= 35350) ) {
            tax = 870.00 + 0.15 * (income - 8700);
        } else if ( (income > 35350) && (income <= 85650) ) {
            tax = 4867.50 + 0.25 * (income - 35350);
        } else if ( (income > 85650) && (income <= 178650) ) {
            tax = 17442.50 + 0.28 * (income - 85650);
        } else if ( (income > 178650) && (income <= 388350) ) {
            tax = 43482.50 + 0.33 * (income - 178650);
        } else if (income > 388350) {
            tax = 112683.50 + 0.35 * (income - 388350);
        }
        // Round to the nearest dollar
        tax = Math.round(tax);

        return tax;                                

    }    

    public static void main(String[] args) {

        // Get user input
        System.out.print("Enter your taxable income (dollars only): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Parse the input to an integer
        int taxableIncome = Integer.parseInt(input);

        // Invoke the computeTax() method
        double result = computeTax(taxableIncome);    

        // Display the result
        System.out.println("Tax: $" + result);

   		// Close scanner
		scanner.close();
    }
}
