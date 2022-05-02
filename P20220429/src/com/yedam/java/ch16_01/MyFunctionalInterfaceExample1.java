package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample1 {
	public static void main(String[] args) {
		//매개변수도 리턴값도 존재하지않는 람다식
		
		MyFunctionalInterface1 fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> {System.out.println("method call2");};	//명령어가 한줄이면 화살표 뒤에 한줄만 표기하는 방식도 가능
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
