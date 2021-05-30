package by.epamtc.sinitsyna.exception;

public class NullBallException extends Exception {

	private static final long serialVersionUID = 1L;

	public NullBallException() {
		super();
	}

	public NullBallException(String message) {
		super(message);
	}

	public NullBallException(String message, Throwable cause) {
		super(message, cause);
	}

}
