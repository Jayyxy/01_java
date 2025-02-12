package edu.kh.op.ex;

import java.util.Scanner;

//수업에서 실행용 class랑 예제코드 클래스가 있음
//해당 클래스는 예제 코드 작성 클래스
//메인 메서드 실행용 클래스는 ExampleRun에 있음


//예제코드 작성용 클래스 (기능용/메서드용)

public class OpExample {

	// ex() method : OpExample 이라는 클래스에 포함된 메서드 
	public void ex1() { 
		System.out.println("ex1() 호출됨");
		
		// 증강(증가,감소) 연산자 : ++, --
		//1을 더하거나 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++; //10에다 +1
		iNum2--; //10에다 -1
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		//전위 연산(어느 연산보다 먼저함)
		int temp1 = 5;
		
		System.out.println(++temp1 + 5); 
		//6+5 ->11
				
		//후위 연산(다른 연산보다 가장 늦게함)
		int temp2=3;
		
		System.out.println(temp2-- +2); 
		//3+2 -> 5 연산후 temp3 -> 2가됨
		System.out.println(temp2);
		
		int a=3;
		int b=5;
		int c=a++ + --b; //3+4->7 , a->4
		
		//최종적으로 a,b,c는 각각 얼마라고 출력될까??
		System.out.printf("%d/%d/%d\n",a,b,c); 
		//4,4,7
	}

		public void ex2() {	
		
			//비교 연산자 : > < >= <= == !=
			//-비교 연산자의 결과는 항상 논리값(true/false)
			int a=10;
			int b=20;
			
			System.out.println((a==b)==false);
			// (false) == false -> true
		
		int c =4;
		int d =5;
		
		System.out.println((++c !=d) == (--c != d));
		//					 ++4(5) !=5 -> flase
		//									--5(4) != 5 ->true		
		//  					false == true  -> false 
 		
		System.out.println(100 > 99);
		System.out.println(100 >= 100);
		System.out.println(99 < 64);
		System.out.println(99 <= 100);
		
		}
		
		public void ex3() {

			//논리 연산자 : && (AND), || (OR)
			
			//&& (AND) : 둘 다 true면 true, 나머지 flase
			//와, 그리고, ~면서,~부터 ,~까지,~사이
			
			int a = 101;
			//a는 100이상 이면서 짝수인가??
			System.out.println((a >= 100) && (a % 2 == 0));
			//t && f -> f
			
			int b = 5;
			//b는 1부터 10까지 숫자 범위에 포함되어 있는가??
			//1~10 -> b는 1보다 크거나 같으면서, 10보다 작거나 같다
			System.out.println((b >= 1) && (b <= 10));
			
			// || (OR) : 둘 다 flase면 false, 나머지 true
			// 또는, 혹은, ~거나
			
			int c = 10;
			
			// c는 10을 초과하거나 짝수인가??
			System.out.println((c > 10) || (c%2==0));

		}

		
		public void ex4() {
			// 삼항 연산자: 조건식 ? true일때 수행될값 : flase일때 수행될 값
			// *조건식: 연산결과가 true/false 인식
			
			int num =30;
			
			// num 이 30보다 크면(초과) "num은 30보다 큰 수 이다"
			// 아니면 "num은 30이하의 수이다."출력
			
			String result = num > 30 ? "num은 30보다 큰 수 이다": "num은 30이하의 수이다.";
			
			System.out.println(result);
			
			//-------------------------------------
			
			//입력받은 정수가 음수인지 양수인지 구분
			//단, 0은 양수로 처리
			
			//Scanner생성
			
			//ex)
			//정수 입력 :4
			//양수 입니다.
			
			//----------------
			
			//정수 입력:-5
			//음수 입니다.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("입력된 정수: ");
			int input1= sc.nextInt();
			
			String result2 = input1 > 0 ? "양수입니다.":"음수입니다."; 
			System.out.println(result2);
					
			
			
			
		}

}


