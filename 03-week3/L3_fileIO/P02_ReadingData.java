package cs520.module3.L3_fileIO;

import java.io.File;
import java.util.Scanner;

public class P02_ReadingData {
	public static void main(String[] args) {
		Scanner scanner = null;

		try {
			File file = new File("file.txt");
			scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine()); 
			}
		} catch (Throwable t) {
			
		} finally {
			// Close scanner
			scanner.close();
		}
	}
}
