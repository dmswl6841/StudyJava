package co.edu.casting;

public class Main {
	public static void main(String[] args) {
//		B b =new B();
//		C c = new C();
//		D d = new D ();
//		E e= new E();
//		
//		A a1 = b;
//		A a2 = c;
//		A a3 = d;
//		A a4 = e;
//		
//		B b1= d;
//		C c1 = e;
		
//		B b3= e;
//		C c2=b;
		
		Parents p1 = new Child();
		p1.method1();
		p1.method2();
		p1.method3();
//		p1.method4();	-> Parents에 method4 없어서 오류
		
		
		
		//클래스 타입 배열
		Parents p2 = new Parents();
		Parents p3 = new Parents();
		Parents p4 = new Parents();
		
		Parents[] parent = {p2, p3, p4};
		
		Parents[] parents = {
				new Parents(),
				new Parents(),
				new Parents()
		};
				
				
		}
		
	}
