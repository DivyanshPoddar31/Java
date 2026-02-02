package day15.tree_set;

public class Movie {

	int id;
	String name;
	int rating;

	public Movie(int id, String name, int rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public String toString() {
		return "\n" + "id : " + id + " name : " + name + " rating : " + rating;
	}

}
