package com.yedam.java.ch15_01;

public class productExample {
	public static void main(String[] args) {
		product<Tv, String> product1 = new product<Tv, String>();
		product1.setT(new Tv());
		product1.setM("스마트Tv");
		
		Tv tv = product1.getT();
		String tvMode1 = product1.getM();
	}
}
