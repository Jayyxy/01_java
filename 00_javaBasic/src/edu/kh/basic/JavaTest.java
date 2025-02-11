package edu.kh.basic;

// 한 줄 주석 : 컴파일러가 해석하지 않는 부분
/*범위 주석: 이 사이에 작성*/
//class :자바 코드가 작성되는 영역

public class JavaTest {
	
	//main치고 ctrl+space -> 자동완성 (해당 코드 별도로 외우기)
	//main메서드:자바 애플리케이션(프로그램)을 실행하기위해서 반드시 필요한 구문

	public static void main(String[] args) { 
		
		//실행 단축키:ctrl+F11
		System.out.println("Hello world");
		System.out.println("저녁 뭐먹을까");
		System.out.println("12345");
		System.out.println(); //매서드
		
	//자동완성 : syso 입력후 ctrl+space
	//해당 줄 복사 : ctrl+alt+방향키 (위 아래) 
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		
		System.out.println("1+2");
		System.out.println(1+2);
		
	//""안에 작성된 코드는 단순 문자열로 인식
	//""안에 작성되지않는 코드는 숫자,변수로 인식

		System.out.println(50-23);
		System.out.println(12*13);
		System.out.println(327/3);
		System.out.println(12%2); //몫 0
		
		//""(문자열)+숫자 함께 작성
		System.out.println("14*19="+266);
		System.out.println("14*19="+14*19);
		
		System.out.println("90+70+65="+90+70+65); //이어쓰기 (맨앞에 연결로 인식)
		System.out.println("90+70+65="+(90+70+65));
		
		//자바는 사칙연산의 우선 순위를 그대로 따름 -> 우선 계산은 () 괄호 사용
		
		// +의 역할 
		// 숫자+숫자 : 덧셈 , 문자+숫자 or 문자+문자: 이어쓰기
		
		System.out.println("A"+"B");
		
	}
}
