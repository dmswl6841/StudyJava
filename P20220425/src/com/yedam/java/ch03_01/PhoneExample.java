package com.yedam.java.ch03_01;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();		//Phone으로 된 인스턴스는 사용 불가.
	
		SmartPhone phone = new SmartPhone("홍길동");
		
		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();
	}
}
