package Test;

public class LengthException extends Exception {

	String message;

	public LengthException(String message) {
		super();
		this.message = message;
	}
	public String toString() {
		return message;
	}
}
