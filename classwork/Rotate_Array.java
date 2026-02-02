package classwork;

import java.util.Scanner;

public class Rotate_Array {

	public static void Rotate(int[] normalarray, int index) {
		int[] rotatedarray = new int[normalarray.length];
		int index1 = 0;
		for (int i = index + 1; i < normalarray.length; i++) {
			rotatedarray[index1] = normalarray[i];
			index1++;
		}
		for (int i = 0; i <= index; i++) {
			rotatedarray[index1] = normalarray[i];
			index1++;
		}
		System.out.print("[ ");
		for (int i = 0; i < rotatedarray.length; i++) {
			System.out.print(rotatedarray[i] + ", ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int length1 = Sc.nextInt();
		int[] normalarray = new int[length1];
		System.out.println("Enter the elements");
		for (int i = 0; i < length1; i++) {
			normalarray[i] = Sc.nextInt();
		}
		System.out.println("Enter index from where to be rotated");
		int index = Sc.nextInt();
		Rotate(normalarray, index);
		Sc.close();
	}

}
