package classwork;

public class Employee {

	public static void main(String[] args) {

	}

}

class UnauthorizedAccessException extends RuntimeException {
	public UnauthorizedAccessException(String message) {
		super(message);
	}
}

class InvalidSalaryException extends Exception {
	public InvalidSalaryException(String message) {
		super(message);
	}
}
