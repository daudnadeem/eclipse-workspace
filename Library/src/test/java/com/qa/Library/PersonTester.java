package com.qa.Library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTester {

	@Test
	public void getName() throws Exception {
		Person person = new Person("Khabib");
		assertEquals("Khabib", person.getName());
	}
		
	@Test
	public void getID() throws Exception{
		Person person = new Person("Khabib");
		assertEquals(2, person.getID());
		
	}
}
