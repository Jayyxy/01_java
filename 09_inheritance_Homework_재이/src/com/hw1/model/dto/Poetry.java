package com.hw1.model.dto;

public class Poetry extends Book{

	private int numberOfPoems; //시수 
	
	public Poetry() {}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
}
