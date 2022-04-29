package com.yedam.java.ch01;

public interface Keypad {

	public static final int NORMAL_MODE = 0;
	public static final int HARD_MODE = 1;
	
	public abstract void leftUpButton();		// 왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void leftDownButton();	// 왼쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void rightUpButton();	//오른쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void rightDownButton();	//오른쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void changeMode();
	
}
