package com.yedam.java.ch10_01;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		if(args.length ==2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : "+data1);		//비정상적으로 종료
		System.out.println("args[1] : "+data2);		//실행되지 않음
		
		//run as  -> run Configuration -> 입력
		}
		else {
			System.out.println("매개변수를 2개 입력해주세요.");
		}
	}

}
