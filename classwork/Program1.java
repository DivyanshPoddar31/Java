package classwork;

class TestBlocks {
	static {
		System.out.print("S");
	}

	{
		System.out.print("I");
	}

	TestBlocks() {
		System.out.print("C");
	}
}

public class Program1 {
	public static void main(String[] args) {
		new TestBlocks();
		new TestBlocks();
	}
}