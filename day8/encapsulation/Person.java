package day8.encapsulation;

public class Person {

	private String name;// null
	private String age;// null
	private String gender;// null
	private Passport passport;

	public void appplyPassport() {
		passport = new Passport();
	}

	public String getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setName(String name) {
		this.name = name;
	}

}
