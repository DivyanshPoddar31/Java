package Day6.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String s = Sc.next();
		String s1 = Sc.next();
		if (s.length() != s1.length()) {
			System.out.println("Not and Anagram");
		} else {
			char[] c = s.toCharArray();
			char[] d = s1.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			for (int i = 0; i < c.length; i++) {
				if (c[i] != d[i]) {
					System.out.println("Not anagram");
					return;
				}
			}
			System.out.println("Anagram");
		}
		Sc.close();
	}

}
