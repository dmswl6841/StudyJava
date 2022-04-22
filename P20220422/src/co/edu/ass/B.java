package co.edu.ass;

public class B {
	public static void main(String[] args) {
		A a = new A();
		
		int temp;
		
		//같은 패키지 안의 다른 클래스
		
		temp = a.a;	// default 접근 가능 여부
		
		temp = a.b;	// public
		
		temp = a.c;	//protected
		
	//	temp = a.d;	//private
		
	}
}
