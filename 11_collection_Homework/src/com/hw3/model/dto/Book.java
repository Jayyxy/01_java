package com.hw3.model.dto;

public class Book { //도서정보를 지정하는 클래스 생성 
	
	//도서 정보를 저장할 변수 생성(멤버 변수)
	private String title; // 책제목
	private String writer; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	private int bookNum; // 책 번호(식별)
	
	public Book() {} 
	//기본 생성자로 책 객체 생성 
	
	

	
	//매개변수 생성자 
	//책 정보를 한번에 넣은 객체 생성 
	public Book(String title, String writer, int price, String publisher, int bookNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}

	//getter/setter를 통해 각 요소들을 가져오고  설정 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	// 책 객체를 출력할 형태 설정 
	@Override //오버라이딩 
	//toString() 메서드, 객체정보를 문자열로 반환 
	public String toString() {
		return  bookNum + "번 도서 : [도서제목 : " + title + 
				" / 도서저자 : " + writer 
				+ " / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]" ;
	}
	
	
	
	
	
}