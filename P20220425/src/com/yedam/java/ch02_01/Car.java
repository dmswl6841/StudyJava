package com.yedam.java.ch02_01;

public class Car {
	//필드
	Tire FrontLeftTire = new Tire("앞왼쪽", 6);
	Tire FrontRightTire = new Tire("앞오른쪽", 2);
	Tire BackLeftTire = new Tire("뒤왼쪽",3);
	Tire BackRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다]");		//제일 먼저 실행
		if(FrontLeftTire.roll()== false) {
			stop();
			return 1;								//return을 만나면 뒤에 구문 실행하지 않고 종료된다.
		}
		if(FrontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(BackLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(BackRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
