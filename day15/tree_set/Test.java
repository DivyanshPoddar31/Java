package day15.tree_set;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		TreeSet<Movie> ts = new TreeSet<Movie>(new MyIntegerComparator());
		Movie e1 = new Movie(1, "Ayush", 7);
		Movie e2 = new Movie(2, "Divyansh", 6);
		Movie e3 = new Movie(3, "Diya", 5);
		Movie e4 = new Movie(4, "Rohit", 8);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println(ts);

		/*
		 * TreeSet<Integer> ts1 = new TreeSet<Integer>(new MyIntegerComparator());
		 * Employee e11 = new Employee(1, "Ayush", 70000); Employee e22 = new
		 * Employee(2, "Divyansh", 30000); Employee e33 = new Employee(3, "Diya",
		 * 30000); Employee e44 = new Employee(4, "Rohit", 40000);
		 * 
		 * ts1.add(e11); ts1.add(e22); ts1.add(e33); ts1.add(e44);
		 * 
		 * System.out.println(ts1);
		 */

	}

}
