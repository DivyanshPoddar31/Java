package day_4.OOPs.staticmethods;

public class Program1 {
	static int i=20;
	static {
		i=30;
		System.out.println(i);
		System.out.println("Static Initialaizer block 1");
		i=test();
	}
	
	public static void main(String[] args) {
		test();
	}
	
	public static int test(){
		System.out.println("hi");
		return 1;
	}

}
