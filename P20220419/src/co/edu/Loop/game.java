package co.edu.Loop;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
				
		while (true) {
			System.out.println("무엇을 내시겠습니까?");
			System.out.println("0 : 가위, 1 : 바위, 2 : 보");
			
			int RCP;
			
			RCP = Integer.parseInt(sc.nextLine());
			
			int num = (int) (Math.random()*3);

			if (RCP > 2) {
				System.out.println("0~2 사이의 숫자를 입력해 주세요.");
			} else if (RCP == 0) {
				System.out.println("user : 가위");
			} else if (RCP == 1){
				System.out.println("user : 바위");
			} else {
				System.out.println("user : 보");
			}
			
			if (num == 0) {
				System.out.println("컴퓨터 : 가위");
			} else if (num == 1){
				System.out.println("컴퓨터 : 바위");
			} else {
				System.out.println("컴퓨터 : 보");
			}
			
			if (RCP > 2) {
				System.out.println("ERROR");
			} else if (RCP == num) {
				System.out.println("비겼습니다.");
			} else if (RCP == 0 && num == 2) {
				System.out.println("이겼습니다.");
			} else if (RCP == 2 && num == 0) {
				System.out.println("졌습니다.");
			} else if (RCP > num) {
				System.out.println("이겼습니다.");
			} else  {
				System.out.println("졌습니다.");
			} 
			
			System.out.println("계속 하시겠습니까?\ny or n");	
			String answer;
			answer = sc.nextLine();
			if(answer.equals("y")) {
				continue;
			}
			else if(answer.equals("n")) {
				break;
			}
			else {
				System.out.println("ERROR!");
				System.out.println("다시 시작해주세요.");
				break;
			}

		}
			
	}
	
}

