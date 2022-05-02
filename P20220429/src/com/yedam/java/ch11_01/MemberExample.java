package com.yedam.java.ch11_01;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		if (m1.equals(m2)) {
//		if(m1==m2) {
			System.out.println("m1와 m2는 동일합니다.");
		}else {
			System.out.println("m1과 m2는 동일하지 않습니다.");
		}
		if (m2.equals(m3)) {
			System.out.println("m2와 m3는 동일합니다.");
		}else {
			System.out.println("m2과 m3는 동일하지 않습니다.");
		}
		if (m3.equals(m1)) {
			
			System.out.println("m3와 m1는 동일합니다.");
		}else {
			System.out.println("m3과 m1는 동일하지 않습니다.");
		}
		
	}

}
