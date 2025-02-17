package edu.kh.control.loop;

import java.util.Scanner;

//기능 제공

public class WhileExample {
	
	Scanner sc = new Scanner(System.in);
	
	
	//wile 문
	
	//-별도의 초기식, 증감식이 존재하지 않고
	// 반복 종료 조건을 자유롭게 설정하는 반복문
	
	// ** 확실히 얼마만큼 반복후에 끝날지는 모르지만
	//    언젠가 반복 조건이 false가 되는 경우 반복 종료.
	
	public void ex1(){
		
		int input = 9;
		
		while(input != 0) { //input이 0이 아니면 무한반복 , 0이면 멈춤
			
			System.out.println("----메뉴선택----");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			
			System.out.println("메뉴 선택 >>");
			input = sc.nextInt();
			
			switch(input) {
			case 1: System.out.println("떡복이를 주문했다."); break;
			case 2: System.out.println("쫄면를 주문했다."); break;
			case 3: System.out.println("김밥을 주문했다."); break;
			case 0: System.out.println("프로그램을 종료합니다.."); break;
			default: System.out.println("잘못 입력하셨습니다!!!"); break;
			//위 숫자가 아닌 다른 숫자를 입력한 경우
			//0을 입력전까지 계속 실행

			
			}
		}
	}

	public void ex2() {
		//입력되는 모든 정수의 합구하기
		//단, 0이 입력되면 반복 종료 후 결과 출력
		//do ~ while문 사용
		//=> 0이 입력되지 안는 다면 계속 반복 
		
		
		// do{
		//    반복 수행할 코드;
		//    -> 무조건 한번은 수행
		//
 		// } while(조건식);
		//
		
		 int input = 0; //입력받은 값을 저장할 변수
		 int sum = 0; //합계를 저장할 변수
		
		 
		 //while 을 쓰게되는 경우 -> 실행?/
		
		 do {
			 System.out.print("정수 입력 : ");
			 input = sc.nextInt();
			 
			 sum += input;
			 //sum = sum + input;
			 
			  }while(input !=0);
		 
		 	System.out.println("합계 : " + sum);
		 
		 
		 
		 
	}
	
	
	
}
