package classwork;

import java.awt.geom.Area;
import java.util.Scanner;

public class User extends Area {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Calculator c = new Calculator();
		int a = 0;
		while (a < 4) {
			System.out.println("Enter a number");
			a = Sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Enter the side value");
				double d = Sc.nextDouble();
				System.out.println(c.Calculator(d));
				break;
			case 2:
				System.out.println("Enter length and breadth");
				double e = Sc.nextDouble();
				double f = Sc.nextDouble();
				System.out.println(c.Calculator(e, f));
				break;
			case 3:
				System.out.println("Enter radius");
				float b = Sc.nextFloat();
				System.out.println(c.Calculator(b));
				break;
			case 4:
				System.out.println("End of App");
				break;
			}

		}
	}

}
