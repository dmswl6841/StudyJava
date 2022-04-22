package company;

import java.util.Scanner;

import co.edu.member.Person;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person p1 = new Person("123456-12345670", "김만두");
		
		p1.info();
		
//----------------------------------------------------------------		
		
		
		//매니저, 프로그래머의 Employee를 상속받고 getSalary를 오버라이드
		//매니저의 월급 =baseSalary + 백만	/프로그래머의 월급=baseSalary + 이백만
		Manager manager = new Manager();
		System.out.println("관리자의 월급 : " + manager.getSalary());
		
		Programmer programmer =new Programmer();
		System.out.println("프로그래머의 월급 : "+ programmer.getSalary());

//	------------------------------------------------------
	
		//bird -> animal에 상속 받고 walk 메소드 재정의
		//bird.walk 출력물 : 헤엄을 칠 수 있다.
		Bird bird = new Bird();
		
		bird.walk();
		bird.fly();
		
//		------------------------------------------------------
		
//		Member mem = new Person();
		
		
		
		
		
		
	}
}
