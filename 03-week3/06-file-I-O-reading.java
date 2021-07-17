//Reading Text Data from a File

File file = new File("file.txt");
Scanner scanner = new Scanner(file);

// With a Scanner instance created, we can now read from the file, line by line. 
//   The hasNextLine() method will return true until all lines have been read:
while (scanner.hasNextLine()) {
    System.out.println(scanner.nextLine());
}

//complete program
import java.io.File;
import java.util.Scanner;

public class P02_ReadingData {

    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Scanner also has methods such as nextInt() and nextBoolean() that can read data from a file (or from console input) and automatically convert it to the corresponding type.
// Each of these methods has a corresponding boolean method to test whether more data exists to be read, such as hasNextInt() and hasNextDouble(). 
  
