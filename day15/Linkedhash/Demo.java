package day15.Linkedhash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		lhs1.add(100);
		lhs1.add(10);
		lhs1.add(50);
		lhs1.add(70);

		System.out.println(lhs1);

		for (int i : lhs1) {
			System.out.println(i);
		}

		Iterator<Integer> it = lhs1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ArrayList<Integer> ar = new ArrayList<Integer>(lhs1);

		ListIterator<Integer> lit = ar.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
	}

}
