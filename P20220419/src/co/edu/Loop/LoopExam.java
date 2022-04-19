package co.edu.Loop;

public class LoopExam {

	public static void main(String[] args) {
		int sum = 0;
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;

		System.out.println("1~5의 합 : " + sum);
//		
//		
//		// 1~5까지의 합을 구하는 코드
//		for (int i= 1; i<=5; i++) {	//i=1이고, i가 5가 될때까지, i에 1을 더해라.
//			sum += i;
			// 첫번째 sum=0
			// 	 sum = sum + i
			// 1) i=1, 0=0+1; -> sum=1;
			// 2) i=2, 1=1+2; -> sum=3;
			// 3) i=3, 3=3+3; -> sum=6;
			// 4) i=4, 6=6+4; -> sum=10;
			// 5) i=5, 10=10+5; -> sum=15;
			
//		}
		
//		 구구단 2단 만들기
		for (int i = 1; i <= 9; i++) {
			System.out.println("2단 : 2 * " + i + "=" + (2*i));
		} 
	
		for (int i = 1; i <= 100; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
			
		}
		for (int i = 1; i <= 100; i++) {
			if (i%3==0) {
				System.out.println("3의 배수 : " + i);
			}
			if (i%2==0) {
				System.out.println("2의 배수 : " + i);
			}
		}
		for (int i = 1; i <= 100; i++) {
			if (i%2==1) {
				System.out.println("홀수 : " + i);
			}
			if (i%2==0) {
				System.out.println("짝수 : " + i);
			}
		}
		
		//구구단 2단부터 9단까지 출력
		for (int i =2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.println(i+"단 : "+ i + "*" + j + "=" + i*j);
			}
		}
		//----------------------------------------------		i는 줄 넘버, j는 *갯수
		for (int i = 1; i<6; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");		//ln은 엔터키라고 보면 된다.
			}
			System.out.println();
		}
		System.out.println("end of prog");
		//----------------------------------------------
		for (int i=1; i<6; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
//----------------------------------------------
		for (int i=0; i<=5; i++) {
			for (int j=5; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//----------------------------------------------		
		for (int i=0; i<=5; i++) {
			for (int j=5; j>0; j--) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//----------------------------------------------
		
		//   *
		//  ***
		// *****
		//*******
		
		
		
//		for (int i=1; i<8; i++) {
//			for (int j=3; j>=i; j--) {
//				System.out.print(" ");
//				if (i%2 == 1) {
//					System.out.println("*");
//				}
//			}
//			System.out.println();
//		}
		
		//----------------------------------------------
		
		
		
		
		
		
		
	}
}
			
