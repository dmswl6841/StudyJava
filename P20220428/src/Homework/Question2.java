package Homework;

import java.util.Scanner;

public class Question2 {
//	Question 2] 다음과 같이 출력결과가 나오도록 실행코드를 수정하세요.
//1) 실행코드

	public static void main(String[] args){
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;
		
		// 사용자입력을 저장할 공간
		int input = 0; 

		// 시도횟수를 세기 위한 변수
		int count = 0; 
		
		Scanner sc = new Scanner(System.in);
		do{
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			try {
			input = Integer.parseInt(sc.next());
				if(answer>input) {
					System.out.println("더 큰 수를 입력하세요.");
			
				}else if(answer<input) {
					System.out.println("더 작은 수를 입력하세요.");
				}else if(input>100 && input<1) {
					System.out.println("1과 100사이의 값을 입력하세요");
				}
				
				else if(answer==input) {
					System.out.println("맞췄습니다.");
					System.out.println("시도 횟수는 "+count + "번 입니다.");
					break;
				}
			//출력결과를 실행하는 코드부분
			}catch(NumberFormatException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
			}
		}while(true);
	}
}
//2) 출력결과
//	1과 100사이의 값을 입력하세요 : 50
//	더 작은 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 : asdf
//	유효하지 않은 값입니다. 다시 값을 입력해주세요.
//	1과 100사이의 값을 입력하세요 : 25
//	더 큰 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 : 38
//	더 큰 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 : 44
//	맞췄습니다.
//	시도횟수는 5번입니다.
//	
//3) 조건
//	try~catch문을 이용하여 "유효하지 않은 값입니다. 다시 값을 입력해주세요."를 출력하세요.

