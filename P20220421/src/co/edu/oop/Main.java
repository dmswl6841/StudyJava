package co.edu.oop;

import java.util.Scanner;

import co.edu.trn.ShoppingMall;
import co.edu.trn.Student;

public class Main {
	public static void main(String[] args) {
//		Car myCar = new Car();	//자동차 객체 생성
//		myCar.company = "기아";
//		myCar.model = "k3";
//		myCar.color = "white";
//		myCar.maxSpeed = 150;
//		
//		myCar.info();
//		
//		//생성자를 통한 데이터 입력
//		Car myCar2 = new Car("sonata", "black");
//		
//		myCar2.info();
//		
//		//각 객체에 주소번지 -> 100번지 -> 데이터를 호출
//		korean k1 = new korean("박자바", "010120-124578");
//		k1.getInfo();
//		korean k2 = new korean("김자바", "852012-246877");
//		k2.getInfo();
//		
//		korean k3 = new korean("미국", "감자", "150105-4521687");
//		k3.getInfo();
		
//		Calculator cal = new Calculator();
//		
//		int result = cal.plus(3, 2); //(3, 2) = 매개 변수
//		System.out.println(result);
//		int result2 = cal.minus(10, 2);
//		System.out.println(result2);
//		
//		cal.plus(3, 2);
//		cal.minus(10, 2);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문번호 입력 >");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("아이디 입력 >");
		String id = sc.nextLine();
		System.out.println("주문자 이름 입력 >");
		String name = sc.nextLine();
		System.out.println("상품 주문번호 입력 >");
		String itemNum =sc.nextLine();
		System.out.println("배송주소 입력 >");
		String address=sc.nextLine();
		
		ShoppingMall shop = new ShoppingMall(no, id, name, itemNum, address);
		shop.getInfo();
		
		
		

		
	}
}
