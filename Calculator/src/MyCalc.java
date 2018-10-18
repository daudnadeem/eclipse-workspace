
public class MyCalc {

	public static void main(String[] args) {
		System.out.println(addition(5, 5));
		System.out.println(subtraction(10, 5));
		System.out.println(multiplication(5, 5));
		System.out.println(division(50, 5));

		System.out.println(allRounder(10, 10, "addition"));
		System.out.println(allRounder(30, 10, "subtraction"));
		System.out.println(allRounder(5, 4, "multiplication"));
		System.out.println(allRounder(200, 10, "division"));

	}

	public static int addition(int number1, int number2) {
		int finalValue = number1 + number2;
		return finalValue;
	}

	public static int subtraction(int number1, int number2) {
		int finalValue = number1 - number2;
		return finalValue;
	}

	public static int multiplication(int number1, int number2) {
		int finalValue = number1 * number2;
		return finalValue;
	}

	public static int division(int number1, int number2) {
		int finalValue = number1 / number2;
		return finalValue;
	}

	public static int allRounder(int number1, int number2, String typeOfOperation) {
		int finalValue = 0;

		if (typeOfOperation == "addition") {
			finalValue = number1 + number2;
			return finalValue;

		} else if (typeOfOperation == "subtraction") {
			finalValue = number1 - number2;
			return finalValue;

		} else if (typeOfOperation == "multiplication") {
			finalValue = number1 * number2;
			return finalValue;

		} else if (typeOfOperation == "division") {
			finalValue = number1 / number2;
			return finalValue;
		}
		return finalValue;
	}
}
