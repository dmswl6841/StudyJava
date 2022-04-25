package com.yedam.java.ch02_01;

public class HankookTire extends Tire {

	public HankookTire(String lotation, int maxRotation) {
		super(lotation,maxRotation);
	}

	@Override
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
