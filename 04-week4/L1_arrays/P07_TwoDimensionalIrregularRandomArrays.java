package cs520.module4.L1_arrays;

public class P07_TwoDimensionalIrregularRandomArrays {

	public static void main(String[] args) {

		// Declare an array of integer values
		int size = 10;
		// Allocate the first dimension
		int[][] patternTable = new int[size][];

		for (int row = 0; row < size; row++) {
			// Allocate the space for each row
			int cols = (int)(Math.random() * 20);
			patternTable[row] = new int[cols];

			for (int col = 0; col < patternTable[row].length; col++) {
				patternTable[row][col] = (int)(Math.random() * 100);
			}
		}
		// Display the table
		for (int row = 0; row < patternTable.length; row++) {
			for (int col = 0; col < patternTable[row].length; col++) {
				System.out.printf("%3d ", patternTable[row][col]);
			}
			System.out.println();
		}

		// Display the table using the for-each construct
		System.out.println("Using the for-each construct");
		for (int[] row : patternTable) {
			for (int data : row) {
				System.out.printf("%3d ", data);
			}
			System.out.println();
		}
	}

}
