package Day6.Encapsulation;

public class Demo {

	// private variable global var,method,Constructor
	// class Initializer not used
	// Constructor ---> object
	Demo() {

	}

	private int a;
	// write value , read the value

	// method write design setter method
	// read the value design getter method

	public int getValueA() {
		return a;
	}

	public void setValueA(int a) {
		this.a = a;
	}

	// Factory Method
	public static Demo getA() {
		return new Demo();
	}
}
