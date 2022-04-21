package co.edu.SelfStudy;

public class Bank {
	//계좌번호, 예금주, 잔액
	//필드
	//생성자 매개변수 3개를 가지는 생성자
	//메소드
	//1. 예금을 할 수 있는 메소드
	//2. 출금을 할 수 있는 메소드
	//3. 현재 잔액을 확인 할 수 있는 메소드

	
	String accNo;
	String owner;
	int balance;
	
	public Bank(String accNo, String owner, int balance) {
		super();
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	void disposit(int money) {
		this.balance += money;
		System.out.println("계좌번호 : "+ accNo);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+ balance);
	}
	void withdraw(int money) {
		this.balance -= money;
		System.out.println("계좌번호 : "+ accNo);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+ balance);
	}
	void balance(int money) {
		this.balance = money;
		System.out.println("계좌번호 : "+ accNo);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+ balance);
	}
}
