package day_4.methods;

public class Program_1 {
	public static void main(String[] args) {
		System.out.println(num(10,20));
		System.out.println(num(10,20,30));
	}
	/*
	 * Method overloading rules
	 * 
	 * 1. The names must be the same.
	 * 2. Change in formal argument can be of three types
	 *             Length
	 *             Type
	 *             Order of Declaration
	 */
	public static int num(int a,int b) {
		return a+b;
	}
	public static int num(int a,int b,int c) {
		return a+b+c;
	}
}

