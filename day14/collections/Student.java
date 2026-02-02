package day14.collections;

public class Student {

	int id;
	String name;
	double perc;

	public Student(int id, String name, double perc) {
		this.id = id;
		this.name = name;
		this.perc = perc;
	}

	public String toString() {
		return "ID->" + id + "Name " + name;
	}

	public double getperc() {
		// TODO Auto-generated method stub
		return perc;
	}

}
