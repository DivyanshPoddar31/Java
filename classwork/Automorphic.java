package classwork;
import java.util.*;

public class Automorphic {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int c=n*n;
		int f=String.valueOf(n).length();
		int d=(int)Math.pow(10, f);
		if(c%d==n) {
			System.out.println("Automorphic");
			return;
		}
		System.out.println("non automorphic");
	}

}
