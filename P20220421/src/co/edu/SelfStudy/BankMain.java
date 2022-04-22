package co.edu.SelfStudy;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		//Main Class
		//인스턴스는 하나만 생성, 인자 3개를 가지도록 생성
		//scanner울 사용해서 예금, 출금, 잔액 확인
		//반복문을 사용, 1.예금 2. 출금 3. 잔액 4. 종료
		Bank acc = new Bank("123-12-123456-0","돔황차", 0);
		
		int menu =0;
		int money =0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료");
		System.out.println("선택 >");
		
		menu = Integer.parseInt(sc.nextLine());8
		
		if(menu==1) {
			System.out.println("예금할 금액을 입력하세요.");
			money = Integer.parseInt(sc.nextLine());
			acc.disposit(money);
		}
		else if(menu==2) {
			System.out.println("출금할 금액을 입력하세요.");
			money = Integer.parseInt(sc.nextLine());
			acc.withdraw(money);
		}
		else if(menu==3) {
			System.out.println("잔액을 확인합니다..");
			acc.balance(money);
		}
		else if(menu==4) {
			System.out.println("프로그램을 종료합니다.");
			
		}
		
		
		
	}

}
