package com.yedam.java.ch11_02;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);	//0은 포함하지만 6은 포함하지 않는다. 따라서 0~5번째 있는 문자까지만 출력.
		System.out.println(firstNum);
		
		String secontNum = ssn.substring(7);	//7번째 문자부터 출력 (0부터 시작하는 순서)
		System.out.println(secontNum);
	}

}
