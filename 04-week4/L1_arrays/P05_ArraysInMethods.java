package cs520.module4.L1_arrays;

public class P05_ArraysInMethods {

	// Return an array of the specified size
	public static int[] iniData(int size) {
		int[] data = new int[size];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 100);
		}
		
		return data;
	}

	// Return the maximum value of the specified array
	public static int findMax(int[] values) {
		int max = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		}
		
		return max;
	}

	// Increment each value in the array by the specified step
	public static void incrementData(int[] values, int step) {
		for (int i = 0; i < values.length; i++) {
			values[i] = values[i] + step;
		}
	}

	// Create a new clone of the specified array
	public static int[] copyData(int[] values) {
		int[] newValues = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			newValues[i] = values[i];
		}
		
		return newValues;
	}

	// Print the values of the array 10 elements per row
	public static void printData(String header, int[] values) {
		System.out.println("-------" + header + "-------");
		System.out.println("The array values are: ");
		for (int i = 0; i < values.length; i++) {
			System.out.print("  " + values[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] data1 = iniData(20);
		printData("STEP1", data1);
		System.out.printf("Max of the above values = %d\n\n", findMax(data1));

		incrementData(data1, 1000);
		printData("STEP2", data1);
		System.out.printf("Max of the above values = %d\n\n", findMax(data1));

		int[] data2 = copyData(data1);
		printData("STEP3", data2);

		incrementData(data2, 1000);
		printData("STEP4", data2);
		System.out.printf("Max of the above values = %d\n\n", findMax(data1));

		printData("STEP5", data1);
	}
}
