package classwork;
import java.util.*;

public class Perfect_Number {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int a=Sc.nextInt();
		int i=1;
		int c=0;
		do {
			if(a%i==0) {
				c=c+i;
			}
			i++;
		}while(i<a);
		if(c==a) {
			System.out.println("perfect number");
			return;
		}
		System.out.println("not aperfect number");
	}

}
