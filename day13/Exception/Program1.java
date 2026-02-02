package day13.Exception;

public class Program1 {

	public static void vote(int i) throws ClassNotFoundException {
		if (i >= 18) {
			System.out.println("Candidate voting");
		} else {
			// try {
			// throw new ArithmeticException();
			throw new ClassNotFoundException();
			// }
		}
	}

	public static void main(String[] args) {
		System.out.println("Candidate gone for voting");
		try {
			vote(17);
		}

		catch (Throwable t) {
			System.out.println("Candidate cannot vote");
		}
		System.out.println("Candidate came home");
	}

}
