package Day11.instances;

public class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.name = name;
		this.percentage = percentage;
		this.id = id;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.id == s.id) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Sourab", 80.0);
		Student s2 = new Student(1, "Sourab", 80.0);

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
