package Assigment;

import java.util.*;

public class Difference {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the Bigger Number");
		int m=Sc.nextInt(),a=0,b=0;
		System.out.println("Enter the Smaller Number");
		int n=Sc.nextInt();
		for(int i=1;i<=m;i++) {
			if(i%n==0) {
				a=a+i;
			}
			else {
				b=b+i;
			}
		}
		if(a>b) {
			System.out.println(a-b);
		}
		else if(b>a) {
			System.out.println(b-a);
		}
		else {
			System.out.println(0);
		}
	}

}
