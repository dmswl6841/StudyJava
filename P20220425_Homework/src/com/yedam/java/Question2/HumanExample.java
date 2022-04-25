package com.yedam.java.Question2;

public class HumanExample {

	public static void main(String[] args) {
//		홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//		박둘이님의 신장 168, 몸무게 90, 비만입니다.
		
		
		StandardWeightInfo stand = new StandardWeightInfo();
		stand.name = "홍길동";
		stand.hight = 168;
		stand.weight = 45;
		stand.getInformation();
		
		ObesityInfo obes = new ObesityInfo();
		obes.name = "박둘이";
		obes.hight = 168;
		obes.weight = 90;
		obes.getInformation();
		
		

	}

}
