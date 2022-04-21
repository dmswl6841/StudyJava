package co.edu.trn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "김씨";
//		p1.Ages = 40;
//		p1.ssn = "111111-1111111";
//		p1.addr = "서울 관악구";
//		
//		Person p2 = new Person();
//		p2.name = "이씨";
//		p2.Ages = 50;
//		p2.ssn = "222222-2222222";
//		p2.addr = "부산 해운대구";
//
//		Person p3 = new Person();
//		p3.name = "박씨";
//		p3.Ages = 45;
//		p3.ssn = "333333-3333333";
//		p3.addr = "대구 수성구";
//				
//		p1.introduce();
//		p2.introduce();
//		p3.introduce();
//		
//		
//		Person p4 = new Person("444444-4444444","최씨" , "대전 성심당",38 );
//		p4.introduce();
		
		Scanner sc = new Scanner(System.in);
		
		
		BankAccount acc = new BankAccount("503-02-210246-12", "감자", 0);
	
		int menu =0;
		int money=0;
		boolean run = true;
		
		while(run) {
		System.out.println("------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("------------------------------");
		System.out.println("선택>");
		
		menu = Integer.parseInt(sc.nextLine());
		
		if(menu==1) {
			System.out.println("입금할 금액을 입력해주세요.");
			money = Integer.parseInt(sc.nextLine());
			acc.deposit(money);
		}
		else if(menu==2) {
			System.out.println("출금할 금액을 입력해주세요.");
			money = Integer.parseInt(sc.nextLine());
			acc.withdraw(money);
		}
		else if(menu==3) {
			System.out.println("잔액을 확인합니다.");
			acc.balance(money);
		}
		else if(menu==4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		}
	}
	
	
	
}
