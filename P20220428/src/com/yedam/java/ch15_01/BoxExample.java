package com.yedam.java.ch15_01;

public class BoxExample {


	public static void main(String[] args) {
		/*
		Box box = new Box();
		
		box.setObject("홍길동");
		
		String name = (String) box.getObject();		//
		System.out.println(name);
		
		box.setObject(new Apple());
		
		Apple apple = (Apple) box.getObject();
	}
	*/
	
	Box<String> stringBox = new Box<String>();
	
	stringBox.set("홍길동");
	String name = stringBox.get();
	
	Box<Apple> appleBox = new Box<Apple>();
	appleBox.set(new Apple());		// String 타입으로 바꿔야하는데 Apple 타입은 String이 아니여서 못씀..?
	Apple apple = appleBox.get();

	}
}
