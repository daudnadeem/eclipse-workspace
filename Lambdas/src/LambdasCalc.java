public class LambdasCalc {

	public static void main(String args[]) {
		LambdasCalc tester = new LambdasCalc();
		calc(10, 5, "sub", tester);
		calc(10, 5, "add", tester);
		calc(10, 5, "mul", tester);
		calc(10, 5, "div", tester);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	public static void calc(int a, int b, String opr, LambdasCalc obj) {

		if (opr == "add") {
			MathOperation addition = (first, second) -> first + second;
			System.out.println(a + " + " + b + " = " + obj.operate(a, b, addition));

		} else if (opr == "sub") {
			MathOperation subtraction = (first, second) -> first - second;
			System.out.println(a + " - " + b + " = " + obj.operate(a, b, subtraction));

		} else if (opr == "mul") {
			MathOperation multiplication = (first, second) -> first * second;
			System.out.println(a + " x " + b + " = " + obj.operate(a, b, multiplication));

		} else if (opr == "div") {
			MathOperation division = (first, second) -> first / second;
			System.out.println(a + " / " + b + " = " + obj.operate(a, b, division));

		}

	}

}