package co.edu.trn;

public class Person {
	//필드	주민번호/이름/주소/나이
	String ssn;
	String name;
	String addr;
	int Ages;
	
	//생성자	기본생성자(필드 초기화x)/	주민번호/이름/주소/나이를 매개변수로 필드 초기화
	public Person() {
	}
	
	public Person(String ssn, String name, String addr, int ages) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.addr = addr;
		Ages = ages;
	}


	//메소드	introduce -> "Person[name : John, age : 20]"
	//Main 클래스 -> 임의의 3명에 대한 객체를 만들고 메소드 introduce 호출하여 정보 출력
	void introduce() {
		System.out.println("Person [name : "+ this.name + ", ages : " + this.Ages + ", 주민번호 : "+ this.ssn + ", 주소 : "+this.addr+"]");
	}
}
