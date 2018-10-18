package com.qa.Anagram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Anagram {

	public static void main(String[] args) throws Exception{

		ArrayList <String> myNewList = new ArrayList<String>();
		myNewList = fileToArray("C:/Users/Admin/Desktop/file.txt");
		
		String firstWord;
		int first, second, largestNumber = 0;
		
		
		for (String word: myNewList) {
			System.out.println(sortMe(word));
			
		}
		
		for (int i = 0; i<myNewList.size()-1;i++) {
			first = myNewList.get(i).length();
			second = myNewList.get(i+1).length();
			if (first > second) {
				largestNumber = first;
			}
			
		}
		System.out.println(largestNumber);
		
		
	}
	
	public static ArrayList fileToArray(String fileName) throws IOException {
		
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		ArrayList <String> myList = new ArrayList<String>();
		
		String text = "";
		String line = reader.readLine();
		
		while (line != null) {
			text = line;
			myList.add(text);
			line = reader.readLine();
		}
		
//		for(String word: myList) {
//			System.out.println(word);
//		}
		return myList;
	}
	
	public static String sortMe(String unSorted) {
		//unsorted = bac
		//sorted = abc
		
		String sorted = "";
		
		Character[] chars = new Character[unSorted.length()];
		for (int i = 0; i < chars.length; i++)
		    chars[i] = unSorted.charAt(i);
		
		Arrays.sort(chars, new Comparator<Character>() {
		    public int compare(Character c1, Character c2) {
		        int cmp = Character.compare(
		            Character.toLowerCase(c1.charValue()),
		            Character.toLowerCase(c2.charValue())
		        );
		        if (cmp != 0) return cmp;
		        return Character.compare(c1.charValue(), c2.charValue());
		    }
		});
				
		StringBuilder sb = new StringBuilder(chars.length);
		for (char c : chars) sb.append(c);
		sorted = sb.toString();

		
		
		return sorted;
	}
	
}

//Create a method that reads words from a file, one per line, and stores them in an Array.
