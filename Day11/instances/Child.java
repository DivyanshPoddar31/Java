package Day11.instances;

public class Child {
	public static void main(String[] args) {
		Parent p = new Child();
		p.parentmethod();

		Child c = (Child) p;
		c.childMethod();
		c.parentMethod();
		System.out.println();
	}
}
