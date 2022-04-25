package com.yedam.java.ch02_02;

public class DriverExample {

public static void main(String[] args) {
	Driver driver = new Driver();
	
	Bus bus = new Bus();
	Taxi taxi = new Taxi();
	
	driver.drive(bus);	// bus -> vehicle	:	자동 변환
	driver.drive(taxi);	// taxi -> vehicle	:	자동 변환
	}
}
