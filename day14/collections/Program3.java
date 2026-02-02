package day14.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program3 {
	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");

		ListIterator<String> itr2 = languages.listIterator();

		System.out.println(languages);
		while (itr2.hasNext()) {
			if (itr2.next().equals("Python")) {
				itr2.add("Ruby");

			}
			System.out.println(languages);
		}

	}
}
