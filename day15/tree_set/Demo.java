package day15.tree_set;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("k");
		ts.add("a");
		ts.add("A");

		System.out.println(ts);

		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(5);
		ts1.add(2);

		System.out.println(ts1);

		TreeSet<Product> ts2 = new TreeSet<Product>();

		Product p1 = new Product();
	}

}
