package co.edu.Loop;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 1. 최소, 최댓값 구하기 scanner -> 3개 최댓값, 최솟값.
		// 2. 두 주사위를 던졌을 때, 주사위의 합이 6인 데이터 출력 : random 데이터 2개 => 합이 6인 데이터 출력
		// 3. 피보나치 수열
		
		//1. 
//		Scanner sc = new Scanner(System.in);
//		
//		int fir;
//		int sec;
//		int thr;
//		int max;
//		System.out.println("첫번째 숫자를 입력하세요.");
//		fir = sc.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		sec = sc.nextInt();
//		System.out.println("세번째 숫자를 입력하세요.");
//		thr = sc.nextInt();
//		
//		max = fir;
		
		//2
//		for (int i = 1; i<=6; i++);
//			int dice1 = (int)(Math.random()*6)+1;
//			int dice2 = (int)(Math.random()*6)+1;
//			if(dice1 + dice2 == 6) {
//				System.out.println("주사위 " + dice1 + ", 주사위 " + dice2);
//			}
//				
		
		//3
		int num1 =1;
		int num2 =2;
		int num3 =0;
		
		while(num3<50) {
			num3 = num1 + num2;
			System.out.println(num1 + ", " + num2 + "=" + num3);
			num1 =num2;
			num2 = num3;
			
		}
	}

}
