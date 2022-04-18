package co.edu.convert;

import java.awt.print.Printable;

public class CalExam {
	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5;
		
		double result = intValue + doubleValue;
		
		System.out.println(result);
		// sysout
		//ctrl + F11
		
		//자동타입변환 연산
		
		byte x = 10;
		byte y = 20;
		//byte result2 = x + y; 컴파일 오류
		int result2 = x+y;
		
		
		char c = 'A';
		char d = 1;
		
		int resulut3 = c+d;
		System.out.println("유니코드 : " + resulut3);
		System.out.println("출력문자 : " + (char)resulut3);
		
		//실수도 타입변환 가능
		
		int i = 1;
		double result4;
		
		result4 = i/5;					//"/"는 몫을 나타냄. 정수부분의 몫이 0이기 때문에 0으로 반영
		System.out.println(result4);
		
		result4 = i/5.0;				//5.0이 실수타입이기 때문에 실수타입으로 변환되어 계산
		System.out.println(result4);
		
		result4 = (double) i/5;			//계산식의 타입을 더블로 변환해서 계산
		System.out.println(result4);
		
		//문자열 + 연산
		
		//숫자 + 숫자
		int value = 15;
		System.out.println(value+3);
		
		//문자열 + 숫자
		System.out.println("문자열+숫자 : "+ value + 2);		//문자 ""사이의 것들은 string.
		System.out.println("문자열+숫자 : "+(value + 2));		//string>int sting 먼저 시작시 뒤도 string

		//숫자 + 문자열
		System.out.println(value+2 + "숫자+문자열");			//int가 먼저 시작, 이후 string
		
		//문자열 -> 숫자로 타입 변환
		//(double), (int) = 숫자 연산에서만 사용
		
		String str = "1000";
		int value6 = Integer.parseInt(str);
		System.out.println(value6);
		String str1 = "0.3";
		double value2 = Double.parseDouble(str1);
		System.out.println(value6);
		
//		String str3 = "가나다";
//		int value7 = Integer.parseInt(str3);
//		System.out.println(str3);
		
		String str4 = String.valueOf(value6);		//숫자 -> 문자열 변환 valueOf
		
	}
}
