package com.yedam.java.ch09_02;

public class AnonymousClass {
	//필드 초기값으로 대입
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void TurnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void TurnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	//로컬 변수값으로 대입
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void TurnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void TurnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.TurnOn();
		localVar.TurnOff();
	}
	void method2(RemoteControl rc) {
		rc.TurnOn();
	}
}
