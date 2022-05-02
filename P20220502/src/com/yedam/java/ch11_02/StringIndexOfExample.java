package com.yedam.java.ch11_02;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		String subject2 = "JAVA PROGRAMMING";		//대소문자를 구분하기 때문에 java로 찾으면 없다고 뜸.
		
		int location = subject.indexOf("프로그래밍");	//->프로그래밍이 위치한 곳부터 알려줌 : 3
		System.out.println(location);
		
		if(subject.indexOf("java") != -1) {	//위치가 어디있든 포함하고 있으며 ㄴ됨
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
}
