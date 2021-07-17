//Writing Text Data to a File
A simple Java mechanism for writing string-based data to a text file is provided by the java.io.FileWriter class, which can be instantiated with the name of the file. 
  Data may then be written to the file using the write() method. 
  
// Create the FileWriter object
Writer writer = new FileWriter("file.txt");

// Write one line at a time to the file
// the \n character signifies a new line
writer.write("Alice\n");
writer.write("Bob\n");
writer.write("Charlie\n");
writer.write("Dave\n");
writer.write("Ed\n");
  
//It is important to close the file when we are done:
writer.close();

//The contents of the resulting text file:
Alice
Bob
Charlie
Dave
Ed


//complete program
import java.io.FileWriter;
import java.io.Writer;

public class P01_WritingData {

    public static void main(String[] args) {
        Writer writer = null;

        try {
            // Create the FileWriter object
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
