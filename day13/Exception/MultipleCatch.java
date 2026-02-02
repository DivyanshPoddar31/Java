package day13.Exception;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			System.out.println(100 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			int[] arr = new int[2];
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e0) {
			System.out.println(e0.getMessage());
		}

		try {
			System.out.println((100 / 0));

			String s = null;
			System.out.println(s.length());

			int[] arr = new int[2];
		}

		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ended");

	}

}
