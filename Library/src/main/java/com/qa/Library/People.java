package com.qa.Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class People {
	static ArrayList<Person> peopleList = new ArrayList<Person>();
	static Map<Person, LibraryItem> myMap = new HashMap<Person, LibraryItem>();

	public Map<Person, LibraryItem> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<Person, LibraryItem> myMap) {
		this.myMap = myMap;
	}

	public void addItem(Person person) {
		peopleList.add(person);
	}

	public ArrayList<Person> listPeople() {
		return peopleList;
	}

}
