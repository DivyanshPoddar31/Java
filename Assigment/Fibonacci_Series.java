package Assigment;

import java.util.*;

public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a= Sc.nextInt();
		int b=0,c=1,d=0;
		while(d<a) {
			System.out.print(d+" ");
			b=c;
			c=d;
			d=b+c;
		}
	}

}
