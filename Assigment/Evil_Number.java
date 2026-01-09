package Assigment;

import java.util.*;

public class Evil_Number {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=Sc.nextInt(),b=0;
		while(a>0) {
			if(a%2==1) {
				b++;
			}
			a=a/2;
		}
		if(b%2==0) {
			System.out.println("Evil Number");
			return;
		}
		System.out.println("Non Evil Number");
	}

}
