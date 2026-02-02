package day14.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program4 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("Hello");
		list.add(100.50);
		list.add(true);
		list.add("World");

		System.out.println(list);

		ListIterator<Object> itr = list.listIterator();
		while (itr.hasNext()) {
			Object c = itr.next();
			if (c.equals("Hello") || c.equals("World")) {
				itr.remove();
			}

		}
		System.out.println(list);

	}

}
