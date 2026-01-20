package Day5.array;

public class Employee {
	String name;
	int salary;
	int id;

	Employee(int id, String name, int salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}

}
