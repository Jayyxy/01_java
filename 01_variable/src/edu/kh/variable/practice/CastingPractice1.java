package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1/iNum2 ); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println( iNum2*dNum ); // 10.0 (자동형변환)
		System.out.println((float)iNum1); // 10.0
		System.out.println((double)iNum1); // 10.0 (다른 풀이)
		
		System.out.println( (float)iNum1/iNum2 ); // 2.5
		System.out.println( iNum1/(float)iNum2 ); // 2.5 (다른풀이)
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3
		System.out.println( (int)(iNum1/fNum) ); // 3 
		System.out.println( iNum1 / (int)fNum); // 3 
		
		System.out.println( (float)iNum1/fNum );// 3.3333333 //1
		System.out.println( (double)iNum1/fNum ); // 3.3333333333333335 //1
		//double과 float의 소수점 차이
		//float :소수점 아래 8번째 까지 연산 후 반올림 
		// -23비트까지만 저장가능하여 근사값이 빨리 끊어지고 반올림 -> 정밀도 낮음
		
		//double:소수점 아래 16번째 자리까지 연산 후 반올림
		// -double은 52비트 까지 저장할수 있어 더 많은 자리수를 정확히 표현할 수 있음 -> 정밀도 높음
		
		
		//float 비트 수 :32비트
		//->저장 방식 : 23비트(가수) + 8비트(지수) + 1비트(부호)
		
		//double 비트 수 :64비트
		//->저장 방식 :52비트(가수) + 11비트(지수) +1비트(부호)
		
		System.out.println("'"+ ch + "'"); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch+iNum1 ); // 75
		System.out.println("'"+ (char)((int)ch+iNum1) +"'"); // 'K'
		
	}
}
