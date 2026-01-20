package Day5.array;

import java.util.Arrays;

public class Program6 {
	public static void main(String[] args) {

		int[] a = { 2, 3, 2, 1, 5, 7, 6 };

		Arrays.sort(a);

		System.out.println(a[0]);
		System.out.println(a[a.length - 1]);
	}
}
