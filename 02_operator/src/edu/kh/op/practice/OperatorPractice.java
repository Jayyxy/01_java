package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
//기능제공클래스
	
	
	public void practice1() {
		
		
		
	/*
	 * 메소드명: publicvoid practice1(){}
		모든사람이사탕을골고루나눠가지려고한다. 
		인원수와사탕개수를키보드로입력받고 1인당동일하게나눠
		가진사탕개수와나눠주고남은사탕의개수를출력하세요.
 
 		[실행화면]
		인원수: 29
		사탕개수: 100
		
		[출력]
 		1인당사탕개수: 3 
		남는사탕개수: 13

	 * 
	 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("인원 수: " );
		int input00= sc.nextInt();
		
		System.out.printf("사탕 개수: " );
		int input01= sc.nextInt();
		
		System.out.printf("1인당사탕개수: %d \n남는사탕개수: %d\n", input01/input00,input01%input00);
		//뒤에 연습문제로 한줄 띄우기
	}
		public void practice2(){


		
		/**
		 * 메소드명: publicvoid practice2(){}
			키보드로입력받은값들을변수에기록하고
			저장된변수값을화면에출력하여확인하세요.
 			ex.이름: 홍길동
 			학년(정수만) : 3
 			반(정수만) : 4
 			번호(정수만) : 15
 			성별(남학생/여학생) : 남학생
 			성적(소수점아래둘째자리까지) : 85.75
 			
 			[출력화면]
 			3학년4반15번홍길동남학생의성적은85.75이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름: ");
		String input001 = sc.next();
		
		System.out.printf("학년: ");
		int input002 = sc.nextInt();
		
		System.out.printf("반: ");
		int input003 = sc.nextInt();
		
		System.out.printf("번호: ");
		int input004 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.printf("성별: ");
		String input005 = sc.nextLine();
		
		System.out.printf("성적: ");
		double input006 = sc.nextFloat();
		
		
		System.out.printf("%d학년%d반%d번%s%s의성적은%f이다.\n",input002,input003,input004,input001,input005,input006);
		
		
	
	}
		
		public void practice3(){
		/*
		 * 메소드명: publicvoid practice3(){}
		 * 국어, 영어, 수학에대한점수를키보드를이용해정수로입력받고, 
		 * 세과목에대한합계(국어+영어+수학)와평균(합계/3.0)을구하세요.
		 * 
 			[실행화면]
 			국어: 60
			영어: 80
			수학: 40
			
			[출력화면]
			합계: 180
			평균: 60.
		 * 
		 * */
			
			Scanner sc = new Scanner(System.in);
			System.out.printf("국어: ");
			int input1 = sc.nextInt();
			
			System.out.printf("영어: ");
			int input2 = sc.nextInt();
			
			System.out.printf("수학: ");
			int input3 = sc.nextInt();
			
			System.out.printf("합계: %d \n 평균: %d\n",input1+input2+input3,(input1+input2+input3)/3);
			
		 }

}
