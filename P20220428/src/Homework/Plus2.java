package Homework;

public class Plus2 {
	public static void main(String[] args) {

		method(true);
		method(false);

	}
	
	public static void method(boolean value){
		System.out.println(1);
		
		if(value){
			throw new RuntimeException();
		}
		
		System.out.println(2);
		
		System.out.println(3);
		
		System.out.println(4);
		
		System.out.println(5);
		
		System.out.println(6);
	}
}

//2) 출력결과
//	1
//	3
//	5
//	1
//	2
//	5
//	6
//
//3) 조건
//	다중 catch문 사용



