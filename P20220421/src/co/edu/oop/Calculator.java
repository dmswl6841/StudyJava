package co.edu.oop;

public class Calculator {
	//필드
	
	
	//생성자
	//메소드
	void execute() {
		powerOn();
	}
	
	
	void powerOn() {
		System.out.println("전원을 킵니다");
		
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	
	int plus(int x, int y) {	// int x, int y = 매개변수
		int result = x+y;
		return result;			//return 할때 타입이 같아야함. (여기서는 int)
	}
	int minus(int x, int y) {
		int result = x-y;
		return result;
	}
	double avg(int x, int y) {
		int sum = plus(x,y);
		double result =(double) sum/2;
		return result;
	}
}
