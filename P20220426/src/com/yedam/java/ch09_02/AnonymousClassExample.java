package com.yedam.java.ch09_02;

public class AnonymousClassExample {
	public static void main(String[] args) {
		AnonymousClass ac = new AnonymousClass();
		//익명 개체 필드로 사용
		ac.rc.TurnOn();
		System.out.println();
		
		//익명 객체 로컬 변수로 사용
		ac.method1();
		System.out.println();
		//익명 객체 매개 변수로 사용
		ac.method2(new RemoteControl() {
			
			@Override
			public void TurnOn() {
				System.out.println("스마트 TV를 켭니다.");
			}
			
			@Override
			public void TurnOff() {
				System.out.println("스마트 TV를 끕니다.");
			}
		});
	}
}
