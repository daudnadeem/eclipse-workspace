package com.qa.Library;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class LibraryItem {

	protected String name;
	private static int nextIdNumber = 1;
	protected int id = 1;
	boolean isAvail = true;
	
	public LibraryItem(String name) {
		System.out.println("Creating new library item!");
		System.out.println(name + " " + id + " added");
		this.name = name;
		id = nextIdNumber;
		nextIdNumber++;
		isAvail = true;

	}

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void checkOut() {
		isAvail = false;
	}
	
	public void checkIn() {
		isAvail = true;
	}

	public boolean isAvail() {
		return isAvail;
	}
	
}
