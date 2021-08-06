package cs520.module3.L2_exceptions;

import java.util.Random;

public class P03_BookReserve {
	
	public void reserveBook(int bookId) throws OutOfStockException {
		// Check current stock
		if (getCurrentStockCount(bookId) == 0) {
			// Throw custom application exception
			throw new OutOfStockException();
		}
	}
	
	private int getCurrentStockCount(int bookId) {
		if (bookId >= 100 && bookId < 200) {
			// We're out of stock of books numbered 100-200
			return 0;
		} else {
			// Return a random integer
			Random random = new Random();
			return random.nextInt(1000);
		}
	}
}
