package edu.kh.array.practice.service;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//기능 제공

public class PracticeService {

	public void practice1(){
		
		//길이가9인배열을선언및할당하고,1부터9까지의값을반복문을이용하여
		//순서대로배열의각인덱스요소에대입하고출력한후
		//짝수번째인덱스값의합을출력하세요. (0 번째인덱스는짝수로취급)
		
		// [실행화면]
		// 1 2 3 4 5 6 7 8 9
		// 짝수번째인덱스합: 25
		
		int[] arr;
		
		arr = new int[9];
		
		// 1 ~ 9 값 할당
		for(int i = 0 ; i<9 ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] );
			
				}
		System.out.println();
		
		// 짝수 번째 인덱스 합
		
		int i = 0 ;
		
		if(i%2 == 0){
			int sum =+ arr[i];
			
		
		System.out.println("짝수 번째 인덱스 합 :" + sum);
			}
		
		
		
		
		
		
		
		
		
		}

	//헷갈
	public void practice2() {
		
	}
	
	
	public void practice3() {
		int[] arr;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("양의 정수 : ");
		int x = sc.nextInt();
		
		arr = new int[x];
		
		for(int i=0 ; i<arr.length ; i++ ){
			arr[i]=i+1;
		
			System.out.print(arr[i]);
		}
		
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		arr = new int[5];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.printf("입력" + i +":");
			int x = sc.nextInt();
			
			arr[i] = x;
			
		}
		

		System.out.printf("검색할 값 :");
		int x = sc.nextInt();
		
		int index = Arrays.asList(arr).indexOf(x);
		
		if(arr[index] == x) {
			System.out.println("인덱스 : "+index);
		}
		else {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	
	
	}

	//헷갈22
	public void practic5() {
		//메소드명: public void practice5(){}
		//문자열을입력받아문자하나하나를배열에넣고검색할문자가문자열에몇개들어가있는지
		//개수와몇번째인덱스에위치하는지인덱스를출력하세요.
		 	
			//[실행화면]
			//문자열: application
			//문자: i
			//application에i가존재하는위치(인덱스) : 4 8 
			//i개수: 2
	

	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("문자열 : ");
	String input = sc.nextLine();
	
	char[] arr = new char[input.length()];
	
	for(int i = 0; i < arr.length; i++) {
		
		arr[i] = input.charAt(i); 
	
	}
	
	System.out.printf("문자");
	//char word = sc.nextLine();
	
	int index = 0;
	
	//int index = arr.indexOf(word);
	//System.out.println(input+"에"+word+"가 존재하는 위치(인덱스) : "+index1);
	//System.out.println(word+" 개수 :"+count(index) );
	

	}

	
	public void practice6() {
		//사용자가 배열의 길이를 직접입력하여 그 값만큼 
		//정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 
		//각각의인덱스에값을초기화하세요.
		//그리고 배열 전체 값을 나열하고 
		//각 인덱스에 저장된 값들의 합을 출력하세요.
		 
		//[실행화면]
		//정수: 5
		//배열0번째인덱스에넣을값: 4
		//배열1번째인덱스에넣을값: -4
		//배열2번째인덱스에넣을값: 3
		//배열3번째인덱스에넣을값: -3
		//배열4번째인덱스에넣을값: 2
		 	
			//4 -4 3 -3 2 
			//총합: 2
		
	Scanner sc = new Scanner(System.in);
	
	//정수 입력
	System.out.printf("정수 : "  );
	int Y = sc.nextInt();
	
	//배열 입력
	int[] arr = new int[Y];
	
	for(int i=0 ; i<arr.length ; i++) {
	
		System.out.printf("배열 "+i+"번째 인덱스에 넣을 값 : ");
		int input = sc.nextInt();
		arr[i] = input;
		
			}
	
	//배열 값 출력
	for(int i=0 ; i<arr.length ; i++) {
		
		System.out.print(arr[i] );
			
	}
	
	System.out.println();

	
	//배열 값 합계
	int sum = 0 ;	
	for(int i=0 ; i<arr.length; i++){
		
		sum+=arr[i];
	}
		System.out.printf("총 합 :"+sum);
	
		}


	
	public void practice7(){
		
	Scanner sc = new Scanner(System.in);
	
	//주민번호 입력
	System.out.printf("주민등록번호(-포함) : ");
	String id = sc.next();
	
	//성별이후 숫자를 *로 변경
	char[] arr = new char[id.length()];
	
	for(int i = 0; i<arr.length; i++) {
		arr[i] = id.charAt(i);
		}
	
	for(int i = 7; i<arr.length; i++) {
		arr[i]='*' ;
		}
	
	for(int i = 0; i<arr.length; i++) {
	System.out.print(arr[i]);
	}
	}
	
	
	public void practice8(){
		// 3이상인 홀수를 입력받아 배열의중간까지는 1부터 1씩증가하여 
		// 오름차순으로값을넣고, 중간 이후부터 끝까지는 
		// 1씩감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3미만일경우 
		// “다시입력하세요”를 출력하고 다시정수를받도록하세요.
		
		//  [실행화면]
		// 정수: 4
		// 다시입력하세요.
		
		// 정수: -6
		// 다시입력하세요.
		
		// 정수: 5
		//  1, 2, 3, 2, 1
		
		//정수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		//배열 출력		
		if(input >=3 && input%3==0) {
			
			for (int i=0; i < arr.length ; i++) {
				arr[i] = arr.length - i;
			}
			
			for (int i=0; i < (arr.length)-1 ;i++) {
				arr[i] = i+1 ;
		}
			
		}
		else {
			System.out.println("다시 입력하세요.");
		}
			
	}

	//random
	public void practic9() {
	
	int[] arr = new int[10];
	
	for(int i = 0 ; i<arr.length ; i++) {
	int random = (int)(Math.random() * 10 + 1) ; 
	arr[i] = random;
	
	System.out.print(arr[i]);
	
	}
	}
	
	public void practice10(){
		
	int[] arr = new int[10];
		
	for(int i = 0 ; i<arr.length ; i++) {
	int random = (int)(Math.random() * 10 + 1) ; 
	arr[i] = random;
		
	
	System.out.print(arr[i]);
	
	int max = arr[0]; 
	int min = arr[0];
	
	if(arr[i] > max){
		System.out.println("최댓값 : arr[i]");
	}
	else if(arr[i] < min){
		System.out.println("최소값 : arr[i]");
	}
	
	
	
	}

}
	
	public void practice11(){
	//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	//1 ~ 10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
	 
	 //[실행화면]
	 //4 1 3 6 9 5 8 10 7 2	
	 int arr[] = new int[10];
	
	 
	 for(int i=0; i < arr.length ; i++) {
		 int random = (int)(Math.random()*10+1);
		 arr[i] = random; 
		 System.out.print(arr[i]);
	 }
	}
	public void practice12(){
		//로또번호자동생성기프로그램을만들기.
		//(중복값없이오름차순으로정렬하여출력하세요.)
		
		//[실행화면]
		//3 4 15 17 28 40
	}
	
	public void practice13(){
	
		
		//문자열을 입력받아 문자열에 어떤문자가 들어갔는지 
		//배열에 저장하고 문자의 개수와 함께 출력하세요.
		
		//[실행화면]
		//문자열: application
		//문자열에있는문자: a, p, l, i, c, t, o, n
		//문자개수: 8
	
	Scanner sc = new Scanner(System.in);	
	System.out.printf("문자열 : ");
	String text = sc.nextLine();
	
	char[] arr = new char[text.length()]; 
	
	for(int i=0 ; i < arr.length; i++) {
	
		arr[i] = text.charAt(i);
		
	
	}
	System.out.println("문자열에 있는 문자 : ");
	System.out.println("문자 개수 : " + arr.length);
	}
	
	
	
	public void practice14(){
	// 사용자가 입력한 배열의 길이 만큼의 문자열배열을 선언 및 할당하고 
	// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화하세요.
	// 단, 사용자에게 배열에 값을 더 넣을지 물어보고 
	// 몇개를 더 입력할건지,늘린곳에 어떤 데이터를 넣을 것인지 받으세요. 
	// 사용자가 더 이상 입력하지 않겠다고 하면 배열전체 값을 출력하세요
		
	}
}