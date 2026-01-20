package Day6.Encapsulation;

public class Program2 {
	public static void main(String[] args) {
		int[] a = { 3, 6, 7 };
		int b = a.length, c = 0, d = 0, e = b;
		while (c < b) {
			while (d < b) {
				for (int i = c; i <= d; i++) {
					e = e + a[i];
				}
				d++;
			}
			c++;
			d = 0;
		}
		System.out.println(e);
	}

}
