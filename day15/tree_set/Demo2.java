package day15.tree_set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {

		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(50);
		ns.add(30);
		ns.add(40);
		ns.add(20);
		ns.add(10);

		System.out.println(ns);

		System.out.println("lower()" + ns.lower(30) + ns.floor(30) + ns.ceiling(30) + ns.higher(30) + ns.pollFirst()
				+ ns.pollLast());
		System.out.println(ns);
	}

}
