package day8.encapsulation;

public class Library {

	private String name;// null
	private String address;// null
	private String pincode;// null
	private String location;// null

	private Book[] book;// null

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPincode() {
		return pincode;
	}

	public String getLocation() {
		return location;
	}

	public Book[] getBook() {
		return book;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Book[] addBook(int i) {
		// TODO Auto-generated method stub
		return new Book[i];
	}

	public String getLibraryDetials() {
		return "Name " + name + " Location " + location + " Address " + address + " Pincode : " + pincode;
	}
}
