package day_4.methods;

import java.util.Scanner;

public class Program_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a Number");//adf-jbsd-bgw
		int a= Sc.nextInt(),b=0,c=a;
		while(c>0) {
			int d=factorial(c%10);
			c=c/10;
			b=b+d;
		}
		if(b==a) {
			System.out.println("Strong Number");
			return;
		}
		System.out.println("Not a Strong Number");
		Sc.close();
	}

	public static int factorial(int i ) {
		int e=1;
		for(int c=1;c<=i;c++) {
			e=e*c;
		}
		return e;		
	}
}
