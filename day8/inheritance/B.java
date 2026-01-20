package day8.inheritance;

public class B extends A {

	static int j = 10;

	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.a);
		B.print();
		System.out.println(B.j);
		// System.out.println(A.j);
		/*
		 * 
		 * i----->A ----> B ---->Generalized member
		 * 
		 * j---->B------>specialised member
		 */
	}

}
