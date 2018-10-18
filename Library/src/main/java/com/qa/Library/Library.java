package com.qa.Library;

import java.util.ArrayList;

public class Library {
	static ArrayList<LibraryItem> mainList;

	public Library() {
		mainList = new ArrayList<LibraryItem>();
	}
	
	public Library(LibraryItem item) {
		mainList.add(item);
	}
	
	public Library(ArrayList<LibraryItem> mainList) {
		super();
		Library.mainList = mainList;
	}
	
	public void addItem(LibraryItem item) {
		mainList.add(item);
	}
	
	public ArrayList<LibraryItem> listLibrary(){
		return mainList;
	}

}
