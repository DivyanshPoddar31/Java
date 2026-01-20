package Day5.oopsfundamentals.non_static;

public class Program4 {
	
	int i=3;
	static String s="Hello";
	public static char[] a;
	public static void main(String[] args) {
		
		Program4 obj1=new Program4();
		
		Program4 obj2=new Program4();
				
		System.out.println(obj1.d);
		obj1.s="Hi";
		System.out.println(obj1.s);
	}
	double d=3;

}
