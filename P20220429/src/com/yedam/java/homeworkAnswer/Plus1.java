package com.yedam.java.homeworkAnswer;

public class Plus1 {
//	1) 실행코드
//	2) 출력결과
//	2
//	3	
//	4
//
//	3) 조건
//	try~catch~finally문 사용


	public static void main(String[] args) {
		
		try {
			method1();
			System.out.println(1);
		}
		catch(NullPointerException e){
			System.out.println(2);
		}
		finally {
			System.out.println(3);
		}
		System.out.println(4);
	}
	public static void method1(){
		throw new NullPointerException();
	}
}


