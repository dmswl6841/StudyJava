package co.yedam.war;

public class VariableExample {
	public static void main(String[] args) {
//		int var1 = 0b1011;	//2진수 표현
//		int var2 = 0206;	//8진수 표현
//		int var3 = 356;		//10진수 표현
//		int var4 = 0xB3;	//16진수 표현
//				
//		System.out.println("var1 : " + var1);
//		System.out.println("var2 : " + var2);
//		System.out.println("var3 : " + var3);
//		System.out.println("var4 : " + var4);
//		
//		long avar1 = 10;
//		long avar2 = 20L;			//long 타입 변수에는 L을 써야한다. 정수 타입에서는 int가 기본이기 때문.
//		long avar3 = 100000000000;
//		long avar4 = 100000000000L;
//		
//		char c1 = 'A';
//		char c2 = 65;
//		char c3 = '\u0041';
//		
//		char c4 = '가';
//		char c5 = 44032;
//		char c6 = '\uac00';
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
//		System.out.println(c5);
//		System.out.println(c6);
//		
//		
//		char ca1 = 'A';		//문자
//		String str = "AB";	//문자열 참조타입
//		
//		String name = "홍길동";
//		String job = "프로그래머";
//		
//		System.out.println(name);
//		System.out.println(job);
//		
//		System.out.println("번호\t이름\t직업");		//\t는 Tab키
//		System.out.println("행 단위 출력\n");			//\n은 ENTER키
//		System.out.println("행 단위 출력\n");
//		System.out.println("우리는\"개발자\"입니다.");
//		System.out.println("봄\\여름\\가을\\겨울");
//		
//		//float floatVar1 = 3.14;		// float은 끝에 f를 붙이지 않으면 double 타입으로 인식한다. 
//		float floatVat2 = 3.14f;		//double이 기본 타입이기 때문
//		
//		double doubleVar1 =0.321;
//		
//		float floatVar3 = 0.1234567890123456789f;
//		double doubleVar2 = 0.12345678901245679;
//		
//		System.out.println(floatVar3);
//		System.out.println(doubleVar2);		//double이 정밀도가 높다. 더 잘게 쪼개지기 때문
		
		
		boolean stop = true;
		boolean state = false;
		
		if(state) {								//if는 () 안에 내용이 참이면 true로 인식한다.
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
