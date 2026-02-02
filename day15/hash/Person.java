package day15.hash;

public class Person {

	int id;
	String email;
	int age;

	public Person(int id, String email, int age) {
		this.id = id;
		this.email = email;
		this.age = age;

	}

	public int hashCode() {
		return ((Integer) id).hashCode();
	}

	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (this.id == p.id) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "id : " + id + ", Email : " + email + " Age : " + age + "\n";
	}

}
