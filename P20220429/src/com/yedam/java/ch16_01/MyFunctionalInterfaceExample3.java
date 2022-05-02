package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		//두개의 매개변수가 있고 리턴값이 있는 람다식
		MyFunctionalInterface3 fi;
		
		fi = (x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(fi.method(2,5));

		fi = (x,y) ->{return x+y;};		//return 구문만 실행한다면
		System.out.println(fi.method(4,7));
		
		fi = (x,y) -> x+y;				//return 생략가능.
		System.out.println(fi.method(10,5));
		
		fi = (x,y) -> Math.subtractExact(x, y);
		System.out.println(fi.method(50,70));
	}
}
