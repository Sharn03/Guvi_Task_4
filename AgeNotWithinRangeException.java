//Question 1

package Task_4;
//In-order to create a User-Defined Exception we have to extends Exception class and invoke its constructors
public class AgeNotWithinRangeException extends Exception {

	public AgeNotWithinRangeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeNotWithinRangeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AgeNotWithinRangeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AgeNotWithinRangeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AgeNotWithinRangeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
