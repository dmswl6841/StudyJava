package co.edu.homework;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int studentNo;
		String studentName;
		int kor;
		int eng;
		int math;
		
		boolean run =true;
		int menu = 0;
		int [][] stdCount = null;
		int stdNo= 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("=================================================================");
			System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("=================================================================");
			System.out.println("선택 >");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("학생 수 >");
				stdNo = Integer.parseInt(sc.nextLine());
				stdCount = new int [stdNo][4];
			}
			else if (menu == 2) {
				System.out.println("학생 정보 입력 >");
				for(int i=0; i<stdCount.length; i++) {
					for(int j=0; j<4; j++) {
						
					}
				}
				
//			}
//			if (menu == 3) {
//				System.out.println("학생 정보 출력 >");
//				stdCount = Integer.parseInt(sc.nextLine());
//			}
//			if (menu == 4) {
//				System.out.println("순위 >");
//				stdCount = Integer.parseInt(sc.nextLine());
//			}
//			if (menu == 5) {
//				System.out.println("종료 >");
//				stdCount = Integer.parseInt(sc.nextLine());
			}
		}
	}

}
