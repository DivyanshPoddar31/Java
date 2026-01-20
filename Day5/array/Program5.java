package Day5.array;

public class Program5 {

	public static void main(String[] args) {
		Employee[] employee = new Employee[5];
		employee[0] = new Employee(1, "Adam", 2000000);
		employee[1] = new Employee(1, "Adam", 2000000);
		for (int i = 0; i < employee.length; i++) {
			employee[i].display();
		}
	}
}
