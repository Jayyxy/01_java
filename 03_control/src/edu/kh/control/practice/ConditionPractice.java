package edu.kh.control.practice;

import java.util.Scanner;

//기능 작성 클래스
public class ConditionPractice {
	
	
public void practice1(){
	//키보드로입력받은정수가양수이면서짝수일때만“짝수입니다.”를출력하고
	//짝수가아니면“홀수입니다.“를출력하세요.
	//양수가아니면“양수만입력해주세요.”를출력하세요.

	//[실행화면1]
	//숫자를한개입력하세요: 8
	//짝수입니다
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자를 한 개 입력하세요");
	int input1 = sc.nextInt();
	
	if (input1%2==0){
			System.out.println("짝수입니다.");
}
	else {
		System.out.println("홀수입니다.");
	}


}

public void practice2(){
	//국어, 영어, 수학세과목의점수를키보드로입력받고합계와평균을계산하고
	//합계와평균을이용하여합격/ 불합격처리하는기능을구현하세요.
	//(합격조건: 세과목의점수가각각40점이상이면서평균이60점이상일경우)
	//합격했을경우과목별점수와합계, 평균, “축하합니다, 합격입니다!”를출력하고
	//불합격인경우에는“불합격입니다.”를출력하세요
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어점수: ");
	int score1 = sc.nextInt();
	
	System.out.print("수학점수: ");
	int score2 = sc.nextInt();
	
	System.out.print("영어점수: ");
	int score3 = sc.nextInt();
	
	int sum = score1+score2+score3 ;
	int avg= sum/3 ;
			
	if (avg>=60 && score1>=40 && score2>=40 && score3>=40) {
		System.out.printf("국어 : %d \n수학 : %d \n영어 : %d\n합계 : %d\n평균 : %d\n축하합니다, 합격입니다!"
				,score1,score2,score3,sum,avg);
		
	}
	else {
	System.out.println("불합격입니다.");
	}
	System.out.println();
}
	

public void practice3(){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.printf("1~12사이의 정수 입력:");
		 int month = sc.nextInt();
		 
		 switch(month) {
		 	case 1 :
		 	case 3 :
		 	case 5 :
		 	case 7 :
		 	case 8 :
		 	case 10 :
		 	case 12 :
		 		System.out.printf("%d월은 31일까지 있습니다.",month);
		 		break;
		 	case 4:
		 	case 6:
		 	case 9:
		 	case 11:
		 		System.out.printf("%d월은 30일 까지 있습니다.",month);
		 		break;
		 	case 2:
		 		System.out.printf("%d월은 28일 까지 있습니다.",month);
		 		break;
		 	default:
		 		System.out.printf("%d월은 잘못 입력된 달입니다.",month);
		 }
		System.out.println();
 	 }


public void practice4(){
	//키, 몸무게를double로입력받고BMI지수를계산하여계산결과에따라
	//저체중/정상체중/과체중/비만을출력하세요.
	 //BMI = 몸무게/ (키(m) * 키(m))
	 //BMI가18.5미만일경우저체중/  18.5이상23미만일경우정상체중
	//BMI가23이상25미만일경우과체중/  25이상30미만일경우비만
	//BMI가30이상일경우고도비만	
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("키(m)를 입력해 주세요 : ");
	double cm = sc.nextDouble();
	
	System.out.printf("몸무게(kg)를 입력해 주세요 : ");
	double kg = sc.nextDouble();
	
	double BMI = kg/(cm*cm);
	
	if(BMI<18.5){
		System.out.printf("BMI 지수: %f\n저체중",BMI);}
	else if(BMI<23){
		System.out.printf("BMI 지수: %f\n정상체중",BMI);}
	else if(BMI<25){
		System.out.printf("BMI 지수: %f\n과체중",BMI);}
	else if(BMI<30){
		System.out.printf("BMI 지수: %f\n비만",BMI);}
	else {
		System.out.printf("BMI 지수: %f\n고도비만",BMI);}
	
	System.out.println();	
	System.out.println();	
	}


public void practice5(){
	//중간고사, 기말고사, 과제점수, 출석횟수를입력하고Pass 또는Fail을출력하세요.
	//평가비율은중간고사20%, 기말고사30%, 과제30%, 출석20%로이루어져있고
	//이때, 출석횟수는총강의횟수20회중에서출석한날만따진값으로계산하세요.
	 //70점이상일경우Pass,70점미만이거나전체강의에30% 이상결석시Fail을출력하세요

	Scanner sc = new Scanner(System.in);
	
	System.out.printf("중간 고사 점수: ");
	double mid = sc.nextInt();
	System.out.printf("기말 고사 점수: ");
	double fin = sc.nextInt();
	System.out.printf("과제 점수: ");
	double homework = sc.nextInt();
	System.out.printf("출석 횟수 점수: ");
	double check = sc.nextInt();
	
	double total= mid*0.2+fin*0.2+homework*0.2+check;
	
	if(check/20 < 0.7) {
		System.out.printf("Fail [출석 횟수 부족 (%.0f/20)]",check);
		}
		else if(total<70){
		System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수 : %.1f\n출석 점수 (20) : %.1f\n총점 : %.1f\nFail [점수 미달]",mid,fin,homework,check,total);
		}
		else {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수 : %.1f\n출석 점수 (20) : %.1f\n총점 : %.1f\nPASS",mid,fin,homework,check,total);
			}
	}


}
	




