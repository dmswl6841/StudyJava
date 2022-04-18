package co.edu.op;

public class OperatorExam {

	public static void main(String[] args) {
		// +, -, *, /, % 사칙연산
		// "/"는 나눗셈을 했을 때 몫만 가지고 옴
		// "%"는 나눗셈을 했을 때 나머지만 가지고 옴
		
		//10,000초	-> 10000/(60*60)=>시간
		//			-> 10000/60 =>분
		//			-> 10000%60 => 초
		int hour = 10000/(60*60);
		int min = 10000/60;
		int sec = 10000%60;
		
		System.out.println(hour + "시간");
		System.out.println(min + "분");
		System.out.println(sec + "초");
		
//		
		int i = 0;
//		int j = 0;
//		i = i+1;
//		//대입연산자
//		i += 1;
//		//증감연산자
//		i = i + j++;		// 값 2, ++가 뒤에 있으면 계산이 끝난 후 +1을 해준다.
//		
//		i = i + ++j;		// 값 3, ++가 앞에 있으면 계산하기 전에 +1을 해준다.
//		
		i++;
		System.out.println(i);		// 1
		++i;
		System.out.println(i);		// 2
		
		System.out.println(++i);	// 3
		System.out.println(i++);	// 3
		System.out.println(i);		// 4
		
			
	}

}
