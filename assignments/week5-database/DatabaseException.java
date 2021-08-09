/** Do not change this file */

package cs520.hw5;

public class DatabaseException extends Exception {

	// Ignore this statement; it is only here to suppress a compiler warning
	static final long serialVersionUID = 1234567890;

	public DatabaseException() {
		super();
	}

	// Constructor overload that accepts a root exception
	public DatabaseException(Exception innerException) {
		super(innerException);
	}

}
