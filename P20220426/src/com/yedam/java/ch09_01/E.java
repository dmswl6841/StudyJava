package com.yedam.java.ch09_01;

public class E {
	//필드
	//인스턴트 필드
	F f = new F();
	G g = new G();		//정적 클래스가 더 범위가 넓다. 인스턴스 필드에 정적 사용가능
	
	//정적 필드
	static F f1 = new F();		//인스턴스 없이 사용가능 but 인스턴스 클래스는 인스턴스가 있어야하므로 정적필드에서는 사용 불가
	static G g1 = new G();
	//생성자
	
	//메소드
	//인스턴트 메소드
	void method1() {		//정적 멤버클래스 사용가능
		F f1 = new F();
		G g1 = new G();
	}
	//정적 메소드
	static void method2() {
		F f1 = new F();
		G g1 = new G();
	}
	//인스턴스 멤버 클래스
	class F{}
	
	//정적 멤버 클래스
	static class G{}
}
