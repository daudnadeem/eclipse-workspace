package com.qa.Library;

public class Runner {

	public static void main(String[] args) {

		Journal j1 = new Journal("Stephen McGough", "22/05/1995", "High Throughput Computing");
		Journal j2 = new Journal("Koutny Maciej", "19/12/1998", "System Validation");
		Journal j3 = new Journal("Ironman", "22/01/2017", "The Avengers");

		Book buk1 = new Book("J K Rowling", "Harry Potter", "Fiction");
		Book buk2 = new Book("T R Tolkein", "LOTR", "Middle Earth");
		Book buk3 = new Book("GoT dude", "Song of Ice and Fire", "Fiction");

		DVD dvd1 = new DVD("The Matrix", "Action", "1994");
		DVD dvd2 = new DVD("The Matrix 2", "Action", "1999");
		DVD dvd3 = new DVD("The Matrix 3", "Action", "2002");

		Library myLib = new Library();
		System.out.println(myLib.listLibrary());
		System.out.println(myLib.listLibrary().size());

		System.out.println(j1.getId());
		System.out.println(dvd3.getId());

		People ppl = new People();
		
		Person david = new Person("David");
		Person john = new Person("john");
		Person alex = new Person("alex");

		
		System.out.println(People.myMap);
		// Check out

		j3.checkOut(david);
		
//		System.out.println(j3.isAvail());
//		j3.checkIn();
//		System.out.println(j3.isAvail());
		
		System.out.println("SHOULD BE HERE:");
		System.out.println(ppl.myMap);
		
		j3.checkIn(david);
		System.out.println("SHOULD BE HERE now:");
		System.out.println(ppl.myMap);
		
		// Setting author
		System.out.println(j3.getJournalAuthor());
		j3.setJournalAuthor("Eminem");
		System.out.println(j3.getJournalAuthor());

		// Time for people
	

		System.out.println(ppl.listPeople());

	}


}
