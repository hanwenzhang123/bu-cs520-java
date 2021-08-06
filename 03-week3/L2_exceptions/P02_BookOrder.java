package cs520.module3.L2_exceptions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P02_BookOrder {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			String input;
			
			// Prompt user for book ID and then check if
			// the input was a number; if not, repeat the
			// input process until a valid number is entered
			do {
				System.out.print("Enter a book ID: ");
				input = scanner.nextLine();
			} while (!Pattern.compile("^\\d+$").matcher(input).matches());

			P03_BookReserve book = new P03_BookReserve();
			int bookId = Integer.parseInt(input);
			book.reserveBook(bookId);

            // The following line will only be reached if no exception was thrown above
            System.out.println("The book is in stock.");
			
			// Close scanner
			scanner.close();
		} catch (OutOfStockException e) {
            // Book out of stock; handle appropriately
            e.printStackTrace();
		} catch (Exception e) {
            // Some other exception
            e.printStackTrace();
		} finally {
			System.out.println("Finally!!!");
		}
		
	    // Continue on with further code
	}
}
