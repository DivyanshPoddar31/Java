package Day6.Encapsulation;

public class Test {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.setValueA(5);
		System.out.println(demo.getValueA());
		demo.setValueA(100);
		System.out.println(demo.getValueA());
		demo.setValueA(200);
		System.out.println(demo.getValueA());
	}
}
