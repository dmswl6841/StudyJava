package co.edu.homework;

import java.util.Scanner;

public class Student extends School{
Scanner sc = new Scanner(System.in);
	void stdinfo(int stdCount) {
		System.out.println("학번 >");
		studentNo = Integer.parseInt(sc.nextLine());
		System.out.println("이름 >");
		studentName = sc.nextLine();
		System.out.println("국어 >");
		kor = Integer.parseInt(sc.nextLine());
		System.out.println("수학 >");
		math = Integer.parseInt(sc.nextLine());
		System.out.println("영어 >");
		eng = Integer.parseInt(sc.nextLine());
		System.out.println("=================================================================");
	}
	
}
