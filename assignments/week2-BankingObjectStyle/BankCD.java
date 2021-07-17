/**
 * BankCD.java (Assignment 2, Part 2)
 * @author Hanwen Zhang
 */

package cs520.hw2.part2;

import java.lang.Math;	//import Math method

public class BankCD {
    //Create field for the BankCD class, private access
    private String bankName;
    private int initialDeposit;
    private double rate;
    private int numberOfYears;
    
    //Constructor - used when we make a new class passing in with the bank name
    public BankCD(String bankName) {
        this.bankName = bankName;   //updating the field value
    }

    //Methods - returns the final value of this CD, type: double
    public double getFinalValue() {
        double finalValue = initialDeposit * (Math.pow((1 + rate), numberOfYears));
        return finalValue;
    }

    //Methods - displays the details of this CD to the console
    public void printCDDetails(){
        System.out.printf("%s %d-year CD of %d at %.2f%% rate is worth $%.2f.\n", 
                            bankName, numberOfYears, initialDeposit, rate * 100, 
                            getFinalValue());    //invoke the getFinalValue method
    }

    //Setters - set the field value for the instance variables
    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    //Getters - return the current value of the field for all of the instance variables
    public String getBankName() {
        return bankName;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public double getRate() {
        return rate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
}
