
public class CheckString {

	public static void main(String [] args) {
		
		checkHardCodedString("this won't work");
//		System.out.println(checkHardCodedString("This is some text"));
		
//		System.out.println(compareStrings("abc","abc"));
		compareStrings("abc","cba");
		
	}
	
	public static Boolean checkHardCodedString(String test) {
		String hardCoded = "This is some text";
		if (test.equals(hardCoded)) {
			return true;
		}
		return false;
	}
	
	public static Boolean compareStrings(String test1, String test2) {
		if (test1.equals(test2)) {
			return true;
		}
		return false;
	}
}
