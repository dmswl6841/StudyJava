package co.edu.Quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		//학점관리 프로그램 switch문만 사용해서 출력하기
		// scanner -> data
		//100~90 : A	89~80 : B	79~70 : C
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학점을 입력하세요.");
		int score;
		score = Integer.parseInt(sc.nextLine());
	
		int score2;
		score2 = score / 10;
		switch(score2) {
			case 7:
				System.out.println("C");
				break;
			case 8:
				System.out.println("B");
				break;
			case 9:
				System.out.println("A");
				break;
			case 10:
				System.out
				.println("A");
				break;
			default:
				System.out.println("학사경고");
		}
	}	

}
