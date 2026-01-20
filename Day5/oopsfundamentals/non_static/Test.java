package Day5.oopsfundamentals.non_static;

public class Test {
	public static void main(String[] args) {
		Person person1= new Person();
		
		System.out.println("person1 : "+person1);
		person1.initialize("A", 22, "Male");
		person1.display();
		
        Person person2= new Person();
		
		System.out.println("person2 : "+person2);
		person2.initialize("B", 21, "Female");
		person2.display();

	}

}