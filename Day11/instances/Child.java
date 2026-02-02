package Day11.instances;

public class Child {
	public static void main(String[] args) {
		Child p = new Child();
		p.parentMethod();

		Child c = (Child) p;
		c.childMethod();
		c.parentMethod();
		System.out.println();
	}

	private void parentMethod() {
		// TODO Auto-generated method stub

	}

	private void childMethod() {
		// TODO Auto-generated method stub

	}
}
