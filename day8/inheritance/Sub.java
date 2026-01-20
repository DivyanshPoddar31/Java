package day8.inheritance;

public class Sub extends Super {

	static int j = 20;

	public static void test() {
		System.out.println("test()");
	}

	static {
		System.out.println("Sub class Static block");
	}

	public static void main(String[] args) {

	}

}
