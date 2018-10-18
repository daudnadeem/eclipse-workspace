package com.qa.Library;

public class Person {

	protected String name;
	protected int ID = 1;
	protected int nextId = 1;
	

	public Person(String name) {
		this.name = name;
		ID = nextId;
		ID++;
		People.peopleList.add(this);
	}

	@Override
	public String toString() {
		return "Person [name: " + name + ", ID: " + ID + "]";
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

}
