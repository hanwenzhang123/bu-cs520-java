
import java.lang.Math;

public class BankingProceduralStyle {

	public static void main(String[] args) {

		int initialDeposit = 5000;

		double bankA = BankA(initialDeposit);
		double bankB = BankB(initialDeposit);

		if(bankA > bankB) {
			System.out.printf("BankA's CD exceeds BankB's CD by $%.2f.\n", (bankA-bankB));
		} else if (bankB > bankA) {
			System.out.printf("BankB's CD exceeds BankA's CD by $%.2f.\n", (bankB-bankA));
		} else {
			System.out.println("Error! Something went wrong!");
		}
    }

    public static double BankA(int initialDeposit){
        double r = 0.04;
        int t = 3;
        double finalValue = initialDeposit * (Math.pow((1 + r), t));
		System.out.printf("BankA %d-year CD of %d at %.2f%% rate is worth $%.2f.\n", t, initialDeposit, r * 100, finalValue);
        return finalValue;
    }

    public static double BankB(int initialDeposit){
        double r = 0.03;
        int t = 4;
        double finalValue = initialDeposit * (Math.pow((1 + r), t));
		System.out.printf("BankB %d-year CD of %d at %.2f%% rate is worth $%.2f.\n", t, initialDeposit, r * 100, finalValue);
        return finalValue;
    }
}
