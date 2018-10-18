package com.qa.Library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibraryItemTester {
	Journal j1 = new Journal("Stephen McGough", "22/05/1995", "High Throughput Computing");
	Journal j2 = new Journal("Koutny Maciej", "19/12/1998", "System Validation");
	Journal j3 = new Journal("Ironman", "22/01/2017", "The Avengers");
	Book buk1 = new Book("J K Rowling", "Harry Potter", "Fiction");
	
	@Test
	public void getAuthor() throws Exception{
		assertEquals("Ironman", j3.getJournalAuthor());
	}
	
	@Test
	public void getTypeOfBook() throws Exception{
		
		assertEquals("Fiction", buk1.getType());
		
	}
	
	@Test
	public void getIdOf() throws Exception{
		assertEquals(j3.getId()+1, buk1.getId());
	}
	
	@Test
	public void checkAvail() throws Exception{
		j3.checkOut();
		assertEquals(false, j3.isAvail());
	}
	
}