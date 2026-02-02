package day13.Exception;

public class FinallyDemo {

	public static void main(String[] args) {

		/*
		 * We can have multiple finally block We can also have try and catch in the
		 * finally block
		 */

		try {
			System.out.println("Program Started");
			System.out.println("Statement 1");
			System.out.println(100 / 0);
			System.out.println("Statement 2");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Satatemnt 3");
		}
		System.out.println("program Ended");
	}

}
