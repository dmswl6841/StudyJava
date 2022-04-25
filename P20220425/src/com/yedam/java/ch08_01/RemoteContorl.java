package com.yedam.java.ch08_01;

public interface RemoteContorl {
	//상속 필드 -> 고정된 수(변수와 반대)
	public static final int MAX_VOLUME = 10;	//-> 상수는 변수 명을 대문자로 해야함.
	int MIN_VOLUME = 0;							//인터페이스 내에서는 public static final을 붙이지 않아도 상수로 인식함.
	//추상 메소드
	public abstract void turnOn();				//추상 메소드여서 ()안에 안적음.
	void turnOff();								//인터페이스 내에서는 public abstract을 붙이지 않아도 추상 메소드로 인식함.
	public abstract void setVolume(int volume);
}
