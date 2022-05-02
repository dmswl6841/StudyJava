package com.yedam.java.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
//		- 프로그램이 실행되면 문제는 Orange, Game, Phone, Smart 중 하나가 랜덤으로 선정되도록 합니다.
//		- 메뉴 1.문자하나 ] 
//			1) 문자 하나를 입력하여 문제를 구성하는 문자가 맞는 지 확인합니다.
//			2) 순서와 상관없이 문제를 구성하는 모든 문자가 입력되면 더이상 입력할 수 없습니다.
//		- 메뉴 2.단어 ]
//			1) 단어를 입력하여 문제를 구성하는 문자가 순서에 맞게 입력되었는 지 확인합니다.
//			2) 단어의 길이와 문제의 길이가 다를 경우 안내 메세지를 출력합니다.
//		- 메뉴 3.입력내역 ]
//			1) 현재까지 맞게 입력한 문자들을 출력합니다.
//		- 메뉴 4.새 게임 ]
//			1) 새 문제를 선정하고 입력된 내역을 초기화합니다.
//		- 메뉴 5.종료 ]
//			1) 프로그램을 종료합니다.
		Scanner sc = new Scanner(System.in);
		
		String Quiz[] = {"Orange", "Game", "Phone", "Smart"};
		int quizNum = (int)(Math.random()*4);
		Quiz[quizNum]= Quiz[quizNum].toLowerCase();
		
		int select = 0;
		String spell =null;
		String word = null;
		boolean run = true;
		List<String> list1 = new ArrayList<>();
		int size = list1.size();
		
		while(run) {
		System.out.println("---------------------------------------------");
		System.out.println(" 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
		System.out.println("---------------------------------------------");
		select = sc.nextInt();
		
		switch(select) {
		case 1:
			
			System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
			
			for(int i=0; i<list1.size(); i++) {
				String a = list1.get(i);
				System.out.print(a+" ");
			}
			
			System.out.print("\n입력 값 >> ");
			spell = sc.next();
			if(Quiz[quizNum].indexOf(spell) != -1) {
				//포함되어있는경우
				System.out.println("문자열을 구성하는 문자입니다.");
				list1.add(spell);
			} else {
				//포함되지 않는 경우
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
			break;
		case 2:
			
			System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
			for(int i=0; i<list1.size(); i++) {
				String a = list1.get(i);
				System.out.print(a+" ");
			}

			System.out.print("\n입력 값 >> ");
			word = sc.next();
			if(Quiz[quizNum].equals(word)) {
				System.out.println("정답입니다.");
			}
			else {
				for(int i=0; i<list1.size(); i++) {
					String a = list1.get(i);
//					if(String a == )
					System.out.print(a+" ");
				}
//				for(int)
			}
			break;
		case 3:
			System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
			for(int i=0; i<list1.size(); i++) {
				String a = list1.get(i);
				System.out.print(a+" ");
			}
			System.out.println();
			break;
		case 4:
			System.out.println("새 게임을 시작합니다.");
			
			break;
		case 5:
			
			run = false;
			break;
		}
		}
		
	}

}
