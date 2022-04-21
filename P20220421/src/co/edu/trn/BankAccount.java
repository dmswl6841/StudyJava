package co.edu.trn;

public class BankAccount {
	//계좌번호, 예금주, 잔액
	String bankNo;
	String owner;
	int balance;
	//필드
	//생성자 매개변수 3개를 가지는 생성자

	public BankAccount(String bankNo, String owner, int balance) {
		super();
		this.bankNo = bankNo;
		this.owner = owner;
		this.balance = balance;
	}
	//메소드
	//1. 예금을 할 수 있는 메소드
	//2. 출금을 할 수 있는 메소드
	//3. 현재 잔액을 확인 할 수 있는 메소드
	void deposit(int money) {
		this.balance += money;
		System.out.println("계좌번호>" + this.bankNo);
		System.out.println("예금주>" + this.owner);
		System.out.println("잔액>" + this.balance);
	}
	void withdraw(int money) {
		this.balance -= money;
		System.out.println("계좌번호>" + this.bankNo);
		System.out.println("예금주>" + this.owner);
		System.out.println("잔액>" + this.balance);
	}
	void balance(int money) {
		this.balance = money;
		System.out.println("계좌번호>" + this.bankNo);
		System.out.println("예금주>" + this.owner);
		System.out.println("잔액>" + this.balance);
	}
	
	//Main Class
	//인스턴스는 하나만 생성, 인자 3개를 가지도록 생성
	//scanner울 사용해서 예금, 출금, 잔액 확인
	//반복문을 사용, 1.예금 2. 출금 3. 잔액 4. 종료
}
