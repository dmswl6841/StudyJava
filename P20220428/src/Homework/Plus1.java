package Homework;

public class Plus1 {
//	1) 실행코드
//	2) 출력결과
//	3	
//	4
//
//	3) 조건
//	try~catch~finally문 사용


	public static void main(String[] args) {
		
		try {
			method1();

			System.out.println(1);
			
			System.out.println(2);
				
		}
		catch(NullPointerException e){
		}
		finally {
			System.out.println(3);
			
			System.out.println(4);
		}
	}
	public static void method1(){
		throw new NullPointerException();
	}
}


