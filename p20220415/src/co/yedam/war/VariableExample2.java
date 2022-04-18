package co.yedam.war;

public class VariableExample2 {

	public static void main(String[] args) {

		//자동 타입 변환 (작은 타입 -> 큰 타입)
		byte a =10;		//byte는 int보다 작다. 작은게 큰데 들어갈때는 자동으로 들어간다.
		int b = a;		//byte < short < int < long < float < double
		long c = b;		
		
		byte d = 10;
		//char f = d;		//char은 음수가 들어가지 않아 자동변환이 되지않는다.
		
		//강제 타입 변환 (큰 타입 -> 작은 타입) *조금이라도 데이터 손실이 생긴다.
		int intValue = 44032;
		char charValue = (char)intValue;
		
		int intValue1 = 10;		//1byte는 127까지 표현 가능
		byte byteValue = (byte)intValue1;
		
		System.out.println(byteValue);
	}

}
