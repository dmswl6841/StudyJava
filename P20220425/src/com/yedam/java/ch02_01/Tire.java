package com.yedam.java.ch02_01;

public class Tire {
	//필드
	public int maxRotation;
	public int acccumulatedRotation;
	public String lotation;
	
	//생성자
	public Tire(String lotation, int maxRotation) {
		this.maxRotation = maxRotation;
		this.lotation = lotation;
	}
	
	
	//메소드
	
	public boolean roll() {
		++acccumulatedRotation;
		if(acccumulatedRotation < maxRotation) {
			System.out.println(lotation + "Tire 수명 : "+ (maxRotation - acccumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+lotation + "Tire 펑크 ***");
			return false;
		}
		
	}
}
