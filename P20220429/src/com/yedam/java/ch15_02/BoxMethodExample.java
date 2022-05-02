package com.yedam.java.ch15_02;

public class BoxMethodExample {

	public static void main(String[] args) {
		Box<Integer> box = Util.<Integer>boxing(100);
		int intValue = box.getT();
		
		Box<String> strBox = Util.<String>boxing("홍길동");
		String strValue = strBox.getT();
	}

}
