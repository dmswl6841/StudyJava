package co.edu.extend;

public class cellPhone {
	
	public String model;
	public String color;
	//생성자
	public cellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("전화가 울립니다.");
	}
	void hangup() {
		System.out.println("전화를 끊습니다.");
	}
}
