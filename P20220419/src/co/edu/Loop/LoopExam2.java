package co.edu.Loop;

import java.util.Scanner;

public class LoopExam2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			int num = (int) (Math.random()*6) +1;
//			System.out.println("주사위 값 : " + num);
//			if (num==6) {
//				break;
//			}
//		}
		
		boolean flag = true;
		int sum =0;
		while(flag) {
			System.out.println("정수를 입력하세요.");
			int value = sc.nextInt();
			
			if (value == -1) {
				System.out.println("탈출 숫자 입력");
				flag =false;
				continue;
			}
			sum += value;
		}
		System.out.println("정수의 합 : " + sum );
		
//		-------------------------------------------------
		
		boolean run = true;
		int balance =0; //계좌
		int menu =0;
		int withDraw =0; //출금
		int deposit =0; //예금
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
			
			menu = sc.nextInt(); //4가지중 하나 선택
			
			switch (menu) {
			case 1:
				System.out.println("예금 금액 >");
				deposit = sc.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.println("출금 금액 >");
				withDraw = sc.nextInt();
				if (balance < withDraw) {
					System.out.println("잔고가 부족합니다.");
				}
				else {
					balance -= withDraw;
				}
				break;
			case 3:
				System.out.println("잔고 : " + balance);
				break;
			case 4:
				System.out.println("종료");
				run = false;
				break;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
}
