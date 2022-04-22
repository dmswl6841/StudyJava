package company;

import co.edu.ass.A;

public class C extends A {
	public static void main(String[] args) {
		
		A a = new A();
		
		int temp;
		
		//	다른 패키지 다른 클래스
		
	//	temp = a.a;	// default	-> 다른 패키지이므로 호출 불가
		
		temp = a.b;	// public	-> 모든 패키지 및 클래스에서 호출 가능
		
	//	temp = a.c;	//protected	-> 다른 패키지이므로 호출 불가
		
	//	temp = a.d;	//private	-> 다른 패키지이므로 호출 불가
		
		C c =new C();
		int d = c.c;	// protacted	-> 자식 클래스이므로 호출 가능
	}
}
