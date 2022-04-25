package com.yedam.java.ch03_02;

public abstract class Animal {		//추상 메소드가 있어서 abstract라는 키워드가 반드시 붙어야 한다.
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();	//추상 메소드 -> 동물들이 각각 다른 소리를 내기 때문에 통일적으로 작성 X
	
}