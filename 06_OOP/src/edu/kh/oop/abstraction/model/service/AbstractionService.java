package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지
// (비밀번호 -> 암호화, 파일 -> 유효한 파일 걸러내는 작업...) 

public class AbstractionService {

	//속성
	//기능
	public void ex1() {
		//People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		//People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
		//new People() : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형처럼 사용된다 * 
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다!!
		
		
		//int[] arr = new int[5];
		//p1.name = "홍길동";
		//p1.gender = '남';
		//p1.pNo = "123456-123456";
		//p1.address = "서울시 중구 남대문로 120";
		//p1.phone =  "010-1234-1234";
		//p1.age = 20;
		
		//System.out.println("p1의 name : "+ p1.name);
		//System.out.println("p1의 gender : "+ (int)p1.gender);
		//char타입 jvm 기본값은 0
		//유니코드 문자체계에서 0은 공백을 나타냄
		//->int 형으로 강제 형변환 하면 0인것을 확인할 수 있음!!
		
		//System.out.println("p1의 address : "+ p1.address);
		//System.out.println("p1의 phone : "+ p1.phone);
		//System.out.println("p1의 age : "+ p1.age);
		
	
		p1.getName();
		
		//전달하는 값(인자) : 전달인자
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		
	}
	
			//본인 객체
			//People 클래스를 이용하여 본인 이름 객체 생성하기
			//본인의 정보 setter 값 대입
			//getter 이용해서 콘솔창 출력하기
	
	
	public void ex2() {
		//People 클래스를 이용해서 국민 객체 만들기
		People p2 = new People();
		
		p2.setName("최재이");
		p2.setGender('여');
		p2.setpNo("020121-4789424");
		p2.setAddress("서울시 성북구 동소문로");
		p2.setPhone("010-3366-7531");
		p2.setAge(24);
		
		System.out.println(p2.getName());
		System.out.println(p2.getGender());
		System.out.println(p2.getpNo());
		System.out.println(p2.getAddress());
		System.out.println(p2.getPhone());
		System.out.println(p2.getAge());
		
	}
}
