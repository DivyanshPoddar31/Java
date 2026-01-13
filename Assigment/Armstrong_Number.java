package Assigment;

import java.util.*;

public class Armstrong_Number {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=Sc.nextInt(),c=a,e=0;
		int b=String.valueOf(a).length();
		while(c>0) {
			int d=c%10;
			c=c/10;
			e=e+(int)Math.pow(d, b);
		}
		if(e==a) {
			System.out.println("Armstrong Number");
			return;
		}
		System.out.println("Not an Armstrong Number");
	}

}
