package com.yedam.java.ch03_01;

public abstract class Phone {		//추상클래스 없어도 실행 됨
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner= owner;
	}
	
	//메소드
	public void turnOn() {						//추상 메소드는 내용이 없다.
		System.out.println("폰 전원을 켭니다.");	//
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
}
