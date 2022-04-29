package com.yedam.java.calculator;

public class GeneralCalculator extends Calculator {

	public GeneralCalculator() {
		
	}
	double[] numList = new double[2];
	int numCount=0;
	double sum = 0;
	
	@Override
	public void init() {		// 값 초기화
	}

	@Override
	public void setInputNum(double num) {		// 값 입력받기 i
		numCount++;
	}

	@Override
	public void print() {		// 출력기능 p
		for(int i=0; i<numList.length; i++) {
			
		}
			
		System.out.println("현재까지 입력된 숫자 : "+ " ");
	}

	@Override
	public void plus() {		// 더하기 +
		switch(numCount) {
		case 0:
		case 1:
			System.out.println("숫자를 더 입력해 주세요.");
			break;
		case 2:
			System.out.println("+ : "+sum);
			for(int i=0; i<=numList.length; i++) {
				 sum += numList[i];
		}
		
		}
	}

	@Override
	public void subtract() {		// 빼기 -
		
		System.out.println("- : "+ ());
	}

	@Override
	public void multiply() {		// 곱하기 *
		
		System.out.println("* : "+ ());
	}

	@Override
	public void division() {		// 나누기 /
		
		System.out.println("/ : "+ ());
	}

	@Override
	public void remain() {		// 나머지 %
		
	}

	@Override
	public void delete() {		// 지우기 0
		
	}

}
