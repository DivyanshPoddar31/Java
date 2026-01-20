package Day11.instances;

public class Employee {

	String id;
	String name;

	public String toString(String id, String name) {
		this.id = id;
		this.name = name;
		return id + name;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.toString("2525", "Jatin"));
	}

}
