import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		numToArray();
		numToList();
	}

	public static int[] numToArray() {
		int[] myArray = new int[100];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i + 1;
		}
		return myArray;
	}

	public static List numToList() {
		List myList = new ArrayList();
		for (int i = 100; i <= 999; i++) {
			myList.add(i);
		}
		return myList;
	}

}
