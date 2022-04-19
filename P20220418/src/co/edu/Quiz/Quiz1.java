package co.edu.Quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		//섭씨, 화씨 -> c = 5/9(F-32)
		//scanner -> 화씨 데이터를 받고, 화씨를 섭씨로 바꾸는 프로그램
		// 주의 0.0 나올 수도 있음.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하세요.");
		double F;
		F = Double.parseDouble(sc.nextLine());
		int c = (int) (( F - 32.0 ) * 5.0 / 9.0);
		System.out.println("섭씨 온도는 " + c + "도 입니다.");

		//System.out.println("섭씨 온도는 " + 5/9(F-32));
	}
}
