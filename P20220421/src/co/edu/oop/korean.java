package co.edu.oop;

public class korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public korean(String n, String s) {
		//this 클래스 내에 선언된 필드를 찝어 사용하겠다.
		this.name =n;
		this.ssn=s;
	}
	
	public korean(String n, String s, String p) {		//생성자의 오버로딩
		this.nation =n;
		this.name = s;
		this.ssn = p;
	}
	//메소드의 오버로딩
	void getInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("국적 : "+ nation);
		System.out.println("주민번호 : " + ssn);
		//return 0; -> 오류 : void는 return을 사용하지 않는다.
		//return; -> 오류안남 : return아래의 함수는 사용하지 않는다.
	}
}
