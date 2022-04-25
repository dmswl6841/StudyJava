package com.yedam.java.Question2;

public class ObesityInfo extends StandardWeightInfo{
	
//	- StandardWeightInfo 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	
	public ObesityInfo() {
	}
	public ObesityInfo(String name, double hight, double weight) {
		super(name, hight, weight);
	}
	
	//메소드
	public double getObesity() {
		return weight/getStandardWeight() * 100;
	}

	@Override
	public void getInformation() {
		if(getObesity()>120) {
		System.out.println("이름 : "+name + " 키 : " + hight + " 몸무게 : "+ weight +  " " + "비만입니다.");
		}
	}
}
