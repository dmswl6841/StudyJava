package com.yedam.java.ch11_02;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "      01";
		String tel2 = "234         ";
		String tel3 ="     5678      ";
		
		System.out.println(tel1 + tel2 + tel3);
		
		String tel =tel1.trim() + tel2.trim() + tel3.trim();	//공백을 제거한 값을 다시 만듦. tel1은 공백이 살아 있음
		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel);
		
	}

}
