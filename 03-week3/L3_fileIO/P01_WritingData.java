package cs520.module3.L3_fileIO;

import java.io.FileWriter;
import java.io.Writer;

public class P01_WritingData {

	public static void main(String[] args) {
		
		Writer writer = null;
		
		try {
			
			// Create the FileWriter object
			// You may need to change this to a full file path, e.g. "c:\\file.txt"
			writer = new FileWriter("file.txt");

			// Write one line at a time to the file;
			// the \n character signifies a new line
			writer.write("Alice\n");
			writer.write("Bob\n");
			writer.write("Charlie\n");
			writer.write("Dave\n");
			writer.write("Ed\n");
			System.out.println("Data file written successfully");
		} catch (Exception e) {
			// Print the exception trace to the console
			e.printStackTrace();
		} finally {
			// Close the output
			if (writer != null) {
				try {
					writer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
