package operators.ternary;



public class program1 {
	//operand1?operand2:operand3
	/*
	 * if operand 1 is true output will be operand 2
	 * if its is false output will be operand 3
	 * if we have to store the value of the result then the type of both the operands should be the same
	 */
	 public static void main(String[] args) {
		System.out.println("hello1"!="hello"?true:false);
		String res = 40<30?"A":"B";
		System.out.println(res);
}
}