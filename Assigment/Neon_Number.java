package Assigment;

import java.util.Scanner;

public class Neon_Number {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a number");
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
