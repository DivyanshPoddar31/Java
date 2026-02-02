package Day12.exception;

public class E1 {
	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			System.out.println(a[6]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
