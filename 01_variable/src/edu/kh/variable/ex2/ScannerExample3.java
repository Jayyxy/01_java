package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문자열 (String)입력
		//문자열을 3번 입력받아 한줄로 출력하기
		
		//ex)
		//입력 1: 안녕?
		//입력 2: 반가워
		//입력 3: 점심 뭐 먹지?
		// 안녕? 반가워 점심 뭐 먹지?
		
		//sc.next()		: 다음 입력된 한 단어를 읽어 옴 
		//					공백(스페이스, 탭 등)을 만나면 입력을 중단
		//sc.nextLine() : 다음 입력된 한 줄을 읽어옴
		//					공백과 함께 입력된 모든 내용을 입력받음
		
		//System.out.print("입력 테스트 : ");
		//String input1 = sc.next(); 
		// 안녕 하세요 입력시 안녕만 출력
		
		//String input1 = sc.nextLine();
		//중간에 공백이 있어도 그대로 출력
		
		//System.out.println(input1);
		System.out.print("입력 테스트1 : ");
		String input3 = sc.nextLine();

		System.out.print("입력 테스트2 : ");
		String input4 = sc.nextLine();
		
		System.out.print("입력 테스트3 : ");
		String input5 = sc.nextLine();

		
		System.out.printf("%s %s %s\n",input3,input4,input5);

	
	}

}
