package day15.tree_set;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<Movie> {
	/*
	 * public int compare(Integer i1, Integer i2) {
	 * 
	 * if (i1 > i2) { return -1; }
	 * 
	 * else if (i1 < i2) { return 1; }
	 * 
	 * return 0; }
	 */

	@Override
	public int compare(Movie o1, Movie o2) {
		if (o1.rating < o2.rating) {
			return -1;
		} else if (o1.rating > o2.rating) {
			return 1;
		}
		return 0;
	}

}
