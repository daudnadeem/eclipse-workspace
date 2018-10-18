package com.qa.Library;

import java.util.ArrayList;

public abstract class LibraryItem {

	private String name;
	private int id; 
	public static ArrayList<LibraryItem> mainList;
	

	public LibraryItem (String name, int id) {
		System.out.println("Creating new library item!");
		System.out.println(name + " " + id + " added");
		this.name = name;
		this.id = id;
		Library.mainList.add(this);
	}

	
	@Override
	public String toString() {
		return "LibraryItem [name=" + name + ", id=" + id + "]";
	}


	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public static ArrayList<LibraryItem> listLibrary(){
		return mainList;
	}
	
}