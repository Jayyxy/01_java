package edu.kh.control.practice;

import java.util.Scanner;

public class playland {
	public static void main(String[] args) {
		
	
	// 놀이기구 탑승 제한 검사 프로그램
	// 조건 - 나이 : 12세 이상
	// - 키 : 140.0cm 이상
	// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
	// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
	// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
	// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
	// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
	// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
	// 나이 O , 키 O : "탑승 가능"

	// [실행화면]
	// 나이 입력 : 130
	// 나이를 잘못 입력 하셨습니다

	// 나이 입력 : 30
	// 키 입력 : 300
	// 키를 잘못 입력 하셨습니다

	// 나이 입력 : 20
	// 키 입력 : 110
	// 나이는 적절하나, 키가 적절치 않음

	// 나이 입력 : 10
	// 키 입력 : 150
	// 키는 적절하나, 나이가 적절치 않음

	// 나이 입력 : 10
	// 키 입력 : 110
	// 나이와 키 모두 적절치 않음

	// 나이 입력 : 15
	// 키 입력 : 160
	// 탑승 가능!!!

	Scanner sc = new Scanner(System.in);
	
	System.out.printf("나이 입력: ");
	int age = sc.nextInt(); 
	System.out.printf("키 입력: ");
	int high = sc.nextInt();
	
	/*
	if(0<age<100 && 0<high<250){
	if(age>=12 && high>=140) {
		System.out.printf("나이 입력 : %d\n키 입력 : %d\n탑승가능!!");
		}
	else if(age<12 && high<140){
		System.out.printf("나이 입력 : %d\n키 입력 : %d\n나이와 키 모두 적절치 않음");
	}
	else if(age<12 ){
		System.out.printf("나이 입력 : %d\n키 입력 : %d\n키는 적절하나, 나이가 적절치 않음");
	}
	else if(high<140){
		System.out.printf("나이 입력 : %d\n키 입력 : %d\n나이는 적절하나, 키가 적절치 않음");
	}
	
	}
	else {
		System.out.println();
	}*/
	}
}
	