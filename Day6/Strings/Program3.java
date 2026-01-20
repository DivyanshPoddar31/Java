package Day6.Strings;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = Sc.next();
		char[] c = s.toCharArray();
		char[] e = new char[c.length];
		int f = 0;
		for (int i = 0; i < c.length; i++) {
			int q = 0;
			for (int j = 0; j <= f; j++) {
				if (c[i] == e[j]) {
					q++;
				}
			}
			if (q == 0) {
				e[f] = c[i];
				f++;
			}
		}
		String d = new String(e);
		System.out.println(d);
	}

}
