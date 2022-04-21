package co.edu.oop;

public class Car {
	//필드	- 속성
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자	- 생성자
	public Car() {	//()안에 들어가는 데이터가 다르면 다른 생성자 생성 가능
		
	}
//	public Car(String model, String color) {
//		this.model = model;		//this : 현재 클래스에 있는 객체에 다른 클래스에 있는 데이터를 입력
//		//this.model -> 현재 Car 클래스에 있는 모델 변수에
//		// = model; -> 다른 클래스(Main)에 있는 model 데이터를 넣는다.
//		this.color = color;
//	}
//	public Car(String a, String b) {
//		this.modle =a;
//		Stringcompany = b;
//	}
	
	//메소드	-기능
	void info() {
		System.out.println("회사 : " + company);
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최대 속도 : " + maxSpeed);
		System.out.println();
	}
}
