package day8.encapsulation;

public class Passport {
	public String id;
	private String dob;
	private String expdate;

	public Passport(String id2, String dob2, String expdate2) {
		// TODO Auto-generated constructor stub
	}

	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public String getDob() {
		return dob;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setID(String id) {
		this.id = id;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
}
