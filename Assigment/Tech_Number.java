package Assigment;

import java.util.*;

public class Tech_Number {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a =Sc.nextInt();
		int b=String.valueOf(a).length();
		if(b%2==0) {
			int c=a%((int)Math.pow(10, b/2));
			int d=a/((int)Math.pow(10, b/2));
			int e=(int)Math.pow((c+d), 2);
			if(e==a) {
				System.out.println("Tech Number");
				return;
			}
		}
		System.out.println("Not a Tech Number");
	}

}
