package Day11.instances;

public class A2 extends A1 {

	int a = 20;

	public void message() {
		System.out.println("A2 messsage");
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(super.a);
		message();
		super.message();

	}

	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.display();
	}

}
