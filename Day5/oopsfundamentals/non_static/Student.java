package Day5.oopsfundamentals.non_static;

public class Student {

	String name;
	int roll;
	int id;

	public void initialize(String name, int roll, int id) {
		this.name = name;
		this.roll = roll;
		this.id = id;
	}

	Student() {

	}

	Student(int roll, int id) {

	}

	Student(int roll, String name) {

	}

	Student(int roll, String name, int id) {

	}

	Student(String name, int id, int roll) {

	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Roll : " + roll);
		System.out.println("Id : " + id);
	}
}
