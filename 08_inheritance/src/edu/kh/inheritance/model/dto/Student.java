package edu.kh.inheritance.model.dto;

/* 현재 상속관
 *      
 *     Objaect
 *     		ㄴ Person
 *     				ㄴ Student
 */

//상속 방법 : 자식 extend 부모 
public class Student extends Person{
	//Student 클래스에 Person 클래스 내용을 확장한
	// == Student 클래스에 Person 클래스의 필드, 메소
	
	//private String name;
	//private int age;
	//private String nationality;
	
	private int grade;	//학년 
	private int classRoom; //반 
	
	public Student() {}
	
	// 기능 
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int  getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
}
