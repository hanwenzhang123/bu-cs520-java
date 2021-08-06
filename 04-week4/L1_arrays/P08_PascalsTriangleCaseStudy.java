package cs520.module4.L1_arrays;

import java.util.Scanner;

public class P08_PascalsTriangleCaseStudy {

	public void createTriangle() {
		System.out.print("Enter number of rows: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int n = Integer.parseInt(input);
		int[][] data = createDataArray(n);
		this.displayTriangle(data);

		// Close scanner
		scanner.close();
	}

	// Create the irregular array and compute the values
	private int[][] createDataArray(int n) {
		int[][] values = new int[n][];

		for (int row = 0; row < n; row++) {
			values[row] = new int[row + 1];
			values[row][0] = 1;
			values[row][row] = 1;

			for (int col = 1; col < row; col++) {
				// Each interior value is the sum of the two values in the previous row
				values[row][col] = values[row - 1][col - 1] + values[row - 1][col];
			}
		}
		return values;
	}

	private void displayTriangle(int[][] data) {
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(data[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P08_PascalsTriangleCaseStudy app = new P08_PascalsTriangleCaseStudy();
		app.createTriangle();
	}
}
