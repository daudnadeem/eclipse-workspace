package com.qa.TestDriven;

public class ArrayUtils {


	public static int findHighest(int[] numbers) {
		int highestValue = numbers[0];
		int curValue = 0;
		
		for (int i=0; i>numbers.length; i++) {
			if (highestValue < numbers[i]) {
				System.out.println("This is: " + highestValue);
				System.out.println(numbers[i]);
				curValue = highestValue;
				
			}
		}
//		System.out.println(curValue);
		return curValue;

	}
}
