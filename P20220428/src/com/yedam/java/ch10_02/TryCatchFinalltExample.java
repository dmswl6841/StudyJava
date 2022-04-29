package com.yedam.java.ch10_02;

public class TryCatchFinalltExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			
			e.getMessage();									//""라는 메세지 출력
			
//			System.out.println("존재하지않는 클래스입니다.");		//존재하지않는 클래스입니다. 라는 메세지 출력
		}
		
	}

}
