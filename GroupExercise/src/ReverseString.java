
public class ReverseString {

	public static void main(String[] args) {

		String result = "Yu copy me I copy yu";
		String result_ = "";

		for (int i = result.length() - 1; i >= 0; i--) {
			result_ += result.charAt(i);
		}

		System.out.println(result_);

	}
}