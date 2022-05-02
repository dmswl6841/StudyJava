package com.yedam.java.homeworkAnswer;

public class Question1 {

	
//	Question1] 다음과 같이 실행코드가 있는 경우 발생할 수 있는 예외가 무엇인지 채워넣으세요.
//1) 실행코드
	public static void main(String[] args){
		String[] strArray = { "10" , "2a" };
		int value = 0;
		for(int i = 0; i <= 2; i++ ){
    	try{
        	value = Integer.parseInt(strArray[i]);
        }
    	catch(NumberFormatException e){
        	System.out.println("숫자형식에 맞지 않습니다.");
        }
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("인덱스 값을 벗어났습니다.");
    	}
    	finally {
        	System.out.println(value);
        }
    }
}
}

