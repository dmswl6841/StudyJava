package com.yedam.java.Question2;

public class StandardWeightInfo extends Human {
	
//	- Human 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
	
	private double getStandardWeight;

	public StandardWeightInfo() {
	}
	public StandardWeightInfo(String name, double hight, double weight) {
		super();
	}
	
	//메소드
	public double getStandardWeight() {
		return  getStandardWeight = ((double)hight - 100) * 0.9;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : "+name + " 키 : " + hight + " 몸무게 : "+ weight + " 표준 체중 : " + getStandardWeight());
	}
}
