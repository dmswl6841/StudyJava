package com.yedam.java.Question2;

public class Human {
	
//	1) Human 클래스를 정의한다.
//- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
	
	//필드
	public String name;
	public int hight = 0;
	public int weight =0;
	
	//생성자
	public Human() {
	}
	
	public Human(String name, int hight, int weight) {
		super();
		this.name = name;
		this.hight = hight;
		this.weight = weight;
	}
	

	//메소드
	public void getInformation() {
		System.out.println("이름 : "+name + " 키 : " + hight + " 몸무게 : "+ weight);
	}
}
