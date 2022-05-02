package com.yedam.java.ch11_01;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		
		System.out.println(myPhone);
				
	}	
		
}