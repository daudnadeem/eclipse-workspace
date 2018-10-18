import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class OperationsOnList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);
//		System.out.println("Print all values in a list:");
//		System.out.println(printAll(numbers));
//		System.out.println("This is new T1");
//		sPrintAll(numbers);
		
		
//		System.out.println("Print only even numbers: ");
//		printEven(numbers);
		System.out.println("Only even numbers: ");
		System.out.println(sPrintEven(numbers));
//		System.out.println("Print all values of the list multiplied by 10: ");
//		printTens(numbers);
		System.out.println("Multiplied by 10 thru stream");
		System.out.println(sPrintTens(numbers));
//		System.out.println("Print highest value in the list: ");
//		printHighest(numbers);
//		System.out.println("Print Highest by external function: ");
//		printHighestByLib(numbers);
		
		System.out.println("highest value by stream: ");
		System.out.println(printHighestByStream(numbers));
//		System.out.println("Print Lowest value in the list: ");
//		printLowest(numbers);
		
		System.out.println("Lowest by streams: ");
		System.out.println(printLowestByStream(numbers));
//		System.out.println("Print Squares: ");
//		printSquares(numbers);
		System.out.println("Squared by Streams: ");
		System.out.println(printSquaresByStream(numbers));
//		System.out.println("Add only unique values to list: ");
//		addUniqueOnly(numbers);
		System.out.println("Unique biiiiitch: ");
		System.out.println(onlyUniqueByStream(numbers));
		
//		numbers.stream().sorted().forEach(System.out::println);

	}

	// TASK 1
	public static List printAll(List initial) {
		return initial;
	}
	
	// Task 1 with Stream:
	
	public static void sPrintAll(List initial) {
		initial.forEach(System.out::println);
	}

	// TASK 2

	public static void printEven(List<Integer> initial) {
		for (int i = 0; i < initial.size(); i++) {
			if (initial.get(i) % 2 == 0) {
				System.out.print(initial.get(i));
			}
		}
		System.out.println("");
	}
	
// 	Task 2 with Stream:
	
	public static List sPrintEven(List<Integer> initial) {
		List<Integer> filtered = initial.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		return filtered;
	}
	

	// TASK 3

	public static void printTens(List<Integer> initial) {
		for (Integer value : initial) {
			int finalValue = value * 10;
			System.out.println(finalValue);
		}

	}
	
	// Task 3 with Stream
	
	public static List sPrintTens(List<Integer> initial) {
		List<Integer> filtered = initial.stream().map(x -> x * 10).collect(Collectors.toList());
		return filtered;
	}

	// TASk 4

	public static void printHighest(List<Integer> initial) {
		
		if (initial.size() > 0) {
			int highest = initial.get(0);
			int highestIndex = 0;

			for (int i = 1; i < initial.size(); i++) {
				int curValue = initial.get(i);
				if (curValue > highest) {
					highest = curValue;
					highestIndex = i;
				}
			}

			System.out.println(highest);
		}
	}

	// Task 4 by MAX function

	public static void printHighestByLib(List<Integer> initial) {
		Integer maxElement = Collections.max(initial);
		System.out.println(maxElement);
	}

	
	// Task 4 by Stream
	
	public static int printHighestByStream(List<Integer> initial) {
		List <Integer> filtered = initial.stream().sorted().distinct().collect(Collectors.toList());
		int high = filtered.get(filtered.size()-1);
		return high;
		
	}
	// Task 5

	public static void printLowest(List<Integer> initial) {
		if (initial.size() > 0) {
			int lowest = initial.get(0);
			int lowestIndex = 0;

			for (int i = 1; i < initial.size(); i++) {
				int curValue = initial.get(i);
				if (curValue < lowest) {
					lowest = curValue;
					lowestIndex = i;
				}
			}

			System.out.println(lowest);
		}
	}
	
	// Task 5 by stream
	
	public static int printLowestByStream(List<Integer> initial) {
		List <Integer> filtered = initial.stream().sorted().distinct().collect(Collectors.toList());
		int low = filtered.get(0);
		return low;
		
	}
	
	
	// Task 6
	
	public static void printSquares(List<Integer> initial) {
		
		for(int value:initial) {
			int finalValue = value * value;
			System.out.println(finalValue);
		}
			
	}
	
	// Task 6 by stream
	
	public static List printSquaresByStream(List<Integer> initial) {
		List<Integer> filtered = initial.stream().map(x -> x * x).collect(Collectors.toList());
		return filtered;
	}
	
	// Task 7
	
	public static Set<Integer> addUniqueOnly(List<Integer> initial) {
		List <Integer> midList = new ArrayList<>();
		for(int value: initial) {
			int finalValue = value * value;
			midList.add(finalValue);
		}
		
		Set<Integer> finalList = new HashSet<Integer>(midList);
        System.out.print(finalList);
        return finalList;
	}
	
	public static List onlyUniqueByStream(List<Integer> initial) {
		List<Integer> filtered = initial.stream().map(x -> x * x).distinct().collect(Collectors.toList());
		return filtered;
	}
	
}
