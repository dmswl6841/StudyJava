package co.edu.trn;

import java.util.Scanner;

public class ShoppingMall {
	
	
	
	//필드
	int ordNum;
	String id;
	String name;
	String itemNum;
	String address;
	

	
	//생성자
	public ShoppingMall(int ordNum, String id, String name, String itemNum, String address) {
		super();
		this.ordNum = ordNum;
		this.id = id;
		this.name = name;
		this.itemNum = itemNum;
		this.address = address;
	}
	//메소드
	public void getInfo() {
		System.out.println("주문 번호 : "+ ordNum);
		System.out.println("주문자 아이디 :" + id);
		System.out.println("주문자 이름 : "+ name);
		System.out.println("상품 주문번호 : "+ itemNum);
		System.out.println("배송 주소 : " + address);
	}
}
