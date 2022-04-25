package com.yedam.java.ch02_03;

public class ChildExample {

	public static void main(String[] args) {
		
		Parents parents = new Child();
		parents.field1 = "Data1";
		parents.method1();
		parents.method2();
		
//		parents.field2 = "Data2"; 	// 오류!	-> 강제 타입변환해야함
//		parents.method3();
		
		Child child = (Child) parents;	//	-> 강제 타입 변환
		child.field2 = "Data2";
		child.method3();
		
		
	}

}
