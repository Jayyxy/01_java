package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {

	// 상속 확인 예제
	public void ex1() {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한국");
		
		System.out.println(p.setName);
		System.out.println(p.setAge);
		System.out.println(p.setNationality);
		
		System.out.println("==============================");
		
		//Person을 상속받은 Student가
		//정말로 Person의 필드,메서드 를 사용할 수 있는가?
		
		//Student 객체 생성
		Student std = new Student();
		
		//Studen 만의 고유한 멤버
		std.setGrade(30);
		std.setClassRoom(5);
		
		//Perso 클래스로부터 상속받은 멤버
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		System.out.println(std.getName());
		System.out.println(std.getNationality());
		System.out.println(std.getAge());
		
		System.out.println("===================");
		
		Employee emp = new Employee(); 
		
		//Employee 만의 고유멤버
		
		//person 클래스로부터 상속받은 멤버 
		
		emp.setName("조");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		//상속의 특징
		// -코드길이 감소 및 중복제거 효과
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 //Employee 객체 생성 
		 //매개변수 생성자 이용 (이름, 나이,국적,회사)
		 //참조변수명 emp ("김노동",30,"한국","KH")
		
		
		
	}
}
