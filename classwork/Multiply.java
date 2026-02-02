package classwork;

import java.util.Scanner;

public class Multiply {

	public static void print(int[] array) {
		int[] MultipliedElements = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int c = 1;
			for (int j = 0; j < array.length; j++) {
				if (j != i) {
					c = c * array[j];
				}
			}
			MultipliedElements[i] = c;
			System.out.print(MultipliedElements[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int string = Sc.nextInt();
		int[] Array = new int[string];
		System.out.println("Enter elements");
		for (int i = 0; i < string; i++) {
			Array[i] = Sc.nextInt();
		}
		print(Array);
	}

}
