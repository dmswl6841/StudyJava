package com.yedam.java.ch11_02;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldstr = "기존의 자바는 객체 지향 언어입니다, 자바는 풍부한 API를 지원합니다.";
		String newstr = oldstr.replace("자바","JAVA");
		
		System.out.println(oldstr);
		System.out.println(newstr);
	}

}
