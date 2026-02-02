package day14.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Program1 {
	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");

		for (String s : languages) {
			System.out.println(s);
		}

		System.out.println("\n");

		Iterator<String> itr = languages.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\n");

		ListIterator<String> itr2 = languages.listIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("\n");

		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}

}
