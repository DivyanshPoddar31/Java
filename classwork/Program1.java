package classwork;
import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		int b=a*a,d=0;
		while(b>0) {
			int c=b%10;
			b=b/10;
			d=d+c;
		}
		if(d!=a) {
			System.out.println("non neon number");
		}
		else {
			System.out.println("neon number");
		}
	}
}
