package Homework;

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
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("실행 매개값이 부족합니다.");
    	}
    	catch(NumberFormatException e){
        	System.out.println("숫자로 변환할 수 없습니다.");
        }
    	finally {
        	System.out.println(value);
        }
    }
}
}

