package Day6.Strings;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = Sc.next();
		char[] c = s.toCharArray();
		int n = c.length - 1, a = n;
		for (int i = 0; i < n / 2; i++) {
			if (c[i] != c[a]) {
				System.out.println("not a palindrome");
				return;
			}
			a--;
		}
		System.out.println("Palindromre");
	}
}
