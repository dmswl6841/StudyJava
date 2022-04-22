package co.edu.extend;

public class Main2 {
	public static void main(String[] args) {
		superSonic ss = new superSonic();
		ss.takeOff();	//부모 클래스의 take off
		ss.fly();		// 자식 클래스의 오버라이드한 fly 메소드
		ss.flyMode = superSonic.SUPERSONIC;	//비행모드를 슈퍼소닉으로 변경
		ss.fly();		// 자식 클래스의 오버라이드한 fly 메소드
		ss.flyMode = superSonic.NOMAL;	//비행모드를 일반으로 변경
		ss.fly();		// 자식 클래스의 오버라이드한 fly 메소드
		ss.land();		//부모 클래스의 land 메소드
	}
}
