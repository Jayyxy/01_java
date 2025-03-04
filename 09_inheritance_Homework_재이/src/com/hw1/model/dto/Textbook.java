package com.hw1.model.dto;

public class Textbook extends Book {

	
	private String subject; //과목
	
	public Textbook() {}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}

