package day14.collections.hashset;

public class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int hashCode() {
		return ((Integer) id).hashCode();
	}

	public boolean equals(Object Obj) {
		Employee e = (Employee) Obj;
		if (this.id == e.id) {
			return true;

		}
		return false;
	}

}
