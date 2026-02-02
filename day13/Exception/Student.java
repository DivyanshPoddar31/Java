package day13.Exception;

public class Student {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameException {
		if (name == null) {
			throw new NameException("Name is not present");
		} else {
			this.name = name;
		}
	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) throws AgeException {
		if (age < 0) {
			throw new AgeException("Age is less than 0");
		} else {
			this.age = age;
		}
	}

}
