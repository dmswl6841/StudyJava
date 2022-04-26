package com.yedam.java.ch09_01;

public class A {		//바깥 클래스	- 중첩
	A(){
		System.out.println("A 인스턴스가 생성됨");
	}
	
	//인스턴스 멤버 클래스
		//생성자
	class B{		//static이 없음 -> 인스턴스 클래스 : 무조건 인스턴스 필요
		B(){
			System.out.println("B 인스턴스가 생성됨");
		}
		//필드
		int field1;
		static int field2; //->인스턴스가 아니기때문에 접근 불가
		
		//메소드
		void method1();
		static void method2();	// -> 정적멤버 클래스는 올 수 없다.(Static)
	}
	
	
	//정적 멤버 클래스
	static class C{
		C() {
			System.out.println("C 인스턴스가 생성됨");
		}
		//필드
		int field1;
		static int field2;		// ->
		
		//메소드
		void method1();
		static void method2();	// -> 
	}
	
	void method() {
		//로컬 클래스
		class D() {
			D(){
				System.out.println("D 인스턴스가 생성됨");				
			}
			
			//필드
			int field1;
			static int field2;	
			//메소드
			void method1(){
				
			}
		//	static void method2(){}		static이 붙는 경우 정적 메소드와 정적 클래스를 허용하지만 그외에는 안됨.
		}	
	}
}