package com.qa.Library;

public class Runner {
	
	public static void main(String[] args) {

//		Book buk1 = new Book("LOTR", 01, "Fiction");
//		System.out.println(buk1.getId());
//		System.out.println(buk1.getName());
//		System.out.println(buk1.getType());
		
		Journal j1 = new Journal("auth2", "15Sep", "Journal", 100);
//		
//		System.out.println(j1.getJournalAuthor());
//		
//		j1.setJournalAuthor("Sean Paul");
//		
//		System.out.println(j1.getJournalAuthor());
//		
//		System.out.println(j1.getDateOfCreation());
//		
		Book buk1 = new Book("Connor", "hisBook", 2, "Computer Science");
//		
//		System.out.println(buk1.getBookAuthor());
//		System.out.println(buk1.getType());
//		System.out.println(buk1.getName());
//		
		
		System.out.println(LibraryItem.listLibrary());
		LibraryItem.listLibrary();
	}

}