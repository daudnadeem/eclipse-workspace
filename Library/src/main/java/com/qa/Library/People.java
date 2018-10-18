package com.qa.Library;

import java.util.ArrayList;

public class People {
	static ArrayList<Person> peopleList = new ArrayList<Person>();

	public void addItem(Person person) {
		peopleList.add(person);
	}

	public ArrayList<Person> listPeople() {
		return peopleList;
	}

}
