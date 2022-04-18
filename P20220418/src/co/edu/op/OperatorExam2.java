package co.edu.op;

public class OperatorExam2 {

	public static void main(String[] args) {
		//논리 부정 연산자
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);		// !을 넣으면 참은 거짓으로, 거짓은 참으로 나온다.
		
		if(!flag) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		//비교 연산자는 숫자만 비교가능 ex.==, !=, >, >= 등등
		
		int i = 99;
		
		if(++i == 100) {		// >=, <=, <, >, !=, ==
			System.out.println("참입니다.");		// 참일 경우 
		} else {
			System.out.println("거짓입니다.");		// 거짓일 경우
		}
		
		String str = "서브웨이";
		String str2 = "서브웨이";
		if(str.equals(str2)) {
			System.out.println("맛있다.");
		} else {
			System.out.println("별로다.");
		}
		
		int var = 6;
												// && : F가 하나라도 있으면 F로 인식. &&가 더 효율적.
												// & : F가 하나 있어도 다른것이 T인지 F인지 본다."
		if(var % 2 == 0 && var % 3 == 0 ) {		//var을 2로 나누었을 때 나머지가 0이고, var을 3으로 나누었을 때 나머지가 0이다.
			System.out.println("2의 배수이면서, 3의 배수이다.");
		} else {
			System.out.println("2 그리고 3의 배수가 아니다.");
		}
		
		
		var = 9;
		if(var % 2 == 0 || var % 3 == 0 ) {
			System.out.println("2의 배수이거나, 3의 배수이다.");
		} else {
			System.out.println("2와 3의 배수가 아니다.");
		}
		
		//삼항 연산자
		
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println("학점은 " + grade + "입니다.");
	}

}
