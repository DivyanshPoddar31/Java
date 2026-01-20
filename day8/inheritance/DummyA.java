package day8.inheritance;

public class DummyA {
	static String a = "a1 variable";

	public static void a1() {
		System.out.println("static a1()");
	}

	static {
		System.out.println("Dummy A static init");
	}
	String az = "a1 variable";

	public void a2() {
		System.out.println("New static a2");
	}

	{
		System.out.println("Dummy A non Static init");
	}

	public DummyA() {
		System.out.println();
		System.out.println("DummyA count");
	}

	public static void main(String[] args) {
		System.out.println("Dummy A main");
	}

}
