package co.edu.Quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		//가위바위보 : 가위(0), 바위 (1), 보(2)
		// scanner, random
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무엇을 내시겠습니까?");
		System.out.println("0 : 가위, 1 : 바위, 2 : 보");
		
		int RCP;
		
		RCP = Integer.parseInt(sc.nextLine());
		
		int num = (int) (Math.random()*3);

		if (RCP == 0) {
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
		
		if (RCP == num) {
			System.out.println("비겼습니다.");
		} else if (RCP == 0 && num == 2) {
			System.out.println("이겼습니다.");
		} else if (RCP > num) {
			System.out.println("이겼습니다.");
		} else if (RCP == 2 && num == 0) {
			System.out.println("졌습니다.");
		} else {
			System.out.println("졌습니다.");
		}
	}

}