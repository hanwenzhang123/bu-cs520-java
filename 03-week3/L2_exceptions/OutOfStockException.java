package cs520.module3.L2_exceptions;

public class OutOfStockException extends Exception {

	// Ignore line 8; classes implementing the Serializable interface
	// (which includes all Exception subclasses through inheritance)
	// must have a serialVersionUID (beyond the scope of this course)
	static final long serialVersionUID = -3387516993124229948L;

	public OutOfStockException() {
		super("We ran out of stock!");
	}
	
	public OutOfStockException(String msg) {
		super(msg);
	}
	
	public OutOfStockException(int bookId) {
		this("We ran out of stock for book #" + bookId);
	}
}
