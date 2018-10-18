package com.qa.Library;

import java.util.ArrayList;

public class Library {
	static ArrayList<LibraryItem> mainList = new ArrayList<LibraryItem>();
		
	
	public void addItem(LibraryItem item) {
		mainList.add(item);
	}
	
	public ArrayList<LibraryItem> listLibrary(){
		return mainList;
	}

}
