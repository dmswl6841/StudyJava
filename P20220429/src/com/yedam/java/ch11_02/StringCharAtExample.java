package com.yedam.java.ch11_02;

public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "020207-3416431";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
