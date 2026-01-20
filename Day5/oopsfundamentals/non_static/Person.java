package Day5.oopsfundamentals.non_static;

public class Person {
		
		int age;
		String name;
		String gender;
		
		public void display() {
			System.out.println("this : "+this);
			System.out.println("Name : "+name);
			System.out.println("Age  : "+age);
			System.out.println("Gender : "+gender);
		}
		
		public void initialize( String name,int age,String gender) {
			System.out.println("this : "+this);
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
}
