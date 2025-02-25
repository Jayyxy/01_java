package edu.kh.inheritance.model.dto;
/*
 * Object
 * 		ㄴ Person
 * 				ㄴ Employee
 */
public class Employee extends Person{

	private String company; // 회사명

	public Employee(String company) {
		super();
		this.company = company;
	}
	
}
