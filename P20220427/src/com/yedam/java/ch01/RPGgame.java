package com.yedam.java.ch01;

public class RPGgame implements Keypad{
	private int nowMode;
	
	public RPGgame() {
		this.nowMode = Keypad.NORMAL_MODE;
		System.out.println("RPGgame");
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}
		if(nowMode == HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		}
		if(nowMode == HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		if(this.nowMode == Keypad.NORMAL_MODE) {
			this.nowMode = Keypad.HARD_MODE;
			System.out.println("현재 모드 : HARD_MODE");
		}
		else if(this.nowMode == Keypad.HARD_MODE) {
			this.nowMode = Keypad.NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
		}
	}

}
