package cs520.module1.L3_controlStructures;

public class P03_PairOfDice {
	public static void rollDice() {
		// Generate a random value for the first die
		int face1 = 1 + (int)(Math.random() * 6);
		// Generate a random value for the second die
		int face2 = 1 + (int)(Math.random() * 6);
		// Create the message that will be displayed
		String result = "[" + face1 + "][" + face2 + "]";
		// Check whether this is a jackpot
		if ((face1 == face2) || (face1 == 2 * face2) || (face2 == 2 * face1)) {
			result = result + " Jackpot!!";
		} else {
			result = result + " Better luck next time";
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		// Invoke the method
		rollDice();
	}
}
