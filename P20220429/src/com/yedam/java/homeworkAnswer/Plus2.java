package com.yedam.java.homeworkAnswer;

public class Plus2 {
	public static void main(String[] args) {

		method(true);
		method(false);

	}
	
	public static void method(boolean value){
		System.out.println(1);
		
		try {
			if(value){
				throw new RuntimeException();
			}
			System.out.println(2);
		}
		catch(RuntimeException e){
			System.out.println(3);
			return;		//메소드를 종료하는 역할
		}
		catch(Exception e){
			System.out.println(4);
		}
		finally {			//finally 구문은 앞에서 메소드가 종료되어도 무조건 실행
			System.out.println(5);
		}
		
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



