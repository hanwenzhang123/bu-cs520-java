import java.util.Scanner; 
import java.lang.Math;

public class BankingProceduralStyle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter your the amount of your savings: ");
		int initialDeposit = scanner.nextInt(); 
		System.out.println("You have a total savings of " + initialDeposit + " dollars.");
		scanner.nextLine();
		System.out.println("Choose to check CD at BankA or BankB or Both: ");
		String bank = scanner.nextLine(); 

		if(bank.equalsIgnoreCase("BankA")) {
			checkCD(initialDeposit, 0.04, 3, "BankA");
		} else if (bank.equalsIgnoreCase("BankB")) {
			checkCD(initialDeposit, 0.03, 4, "BankB");
		} else if (bank.equalsIgnoreCase("Both")) {
			checkCD(initialDeposit, 0.04, 3, "BankA");
			checkCD(initialDeposit, 0.03, 4, "BankB");
		} else {
			System.out.println("Something went wrong, please check if you have entered correctly.");
		}

		scanner.close();
	};

	public static void checkCD (int initialDeposit, double rate, int years, String bankName) {
		double finalValue = initialDeposit * (Math.pow((1 + rate), years));
		System.out.printf("%s %d-year CD of %d at %.2f%% rate is worth $%.2f.\n", bankName, years, initialDeposit, rate * 100, finalValue);
	}
}
