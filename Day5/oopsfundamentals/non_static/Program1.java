package Day5.oopsfundamentals.non_static;

public class Program1 {
	
	//instance variable or object variable
	int a;
	double d;
	byte b;
	String s;
	public static void main(String[] args) {
		int i=20;//primitive
		Program1 obj1 = new Program1();// Reference variable
		obj1.a=10;
		System.out.println(obj1);
		System.out.println(new Program1());
	}
}
