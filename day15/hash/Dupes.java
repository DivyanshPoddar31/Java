package day15.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Dupes {

	public static void main(String[] args) {

		ArrayList<Integer> Numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 40, 50, 10, 50, 20, 30));

		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();

		for (int i : Numbers) {
			if (!hs1.add(i)) {
				hs2.add(i);
			}
		}
		System.out.println(hs2);
	}

}
