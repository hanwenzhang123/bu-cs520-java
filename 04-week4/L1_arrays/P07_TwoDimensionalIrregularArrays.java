package cs520.module4.L1_arrays;

import java.util.Random;

public class P07_TwoDimensionalIrregularArrays {

	public static void main(String[] args) {

		// Declare an array of integer values
		int size = 10;
		// Allocate the first dimension
		int[][] patternTable = new int[size][];

		for (int row = 0; row < size; row++) {
			// Allocate the space for each row
			Random r = new Random();
			patternTable[row] = new int[r.nextInt(10)];
			for (int col = 0; col < patternTable[row].length; col++) {
				patternTable[row][col] = col + 1;
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
