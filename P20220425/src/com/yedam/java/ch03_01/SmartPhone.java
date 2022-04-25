package com.yedam.java.ch03_01;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);		//상속 관계에서는 무조건 슈퍼연산자. 부모 클래스의 생성자 호출 1순위.
		
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
