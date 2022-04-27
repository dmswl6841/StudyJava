package com.yedam.java.Question3;

public abstract class Culture {
//	1) Culture 클래스를 정의한다. 추상 클래스
//	- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//	- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//	(2) public String getGrade() : 평점을 구하는 기능 (5점 만점)
//	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	
	//필드
	String name;
	int directorNum;
	int actNum;
	int audience;
	int score;
	
	//생성자
	public Culture() {
	}
	public Culture(String name, int directorNum, int actNum) {
		super();
		this.name = name;
		this.directorNum = directorNum;
		this.actNum = actNum;
	}
	
	//메소드
	public void setTotalScore(int score) {
		this.audience++;
		this.score += score;
	}
	public String getGrade() {
		
		if(getGrade() =="1") {
			System.out.println("☆");
		}
		else if(getGrade() =="2") {
			System.out.println("☆☆");
		}
		else if(getGrade() =="3") {
			System.out.println("☆☆☆");
		}
		else if(getGrade() =="4") {
			System.out.println("☆☆☆☆");
		}
		else if(getGrade() =="5") {
			System.out.println("☆☆☆☆☆");
		}
		else {
			System.out.println("1~5사이의 수를 입력해 주세요.");
		}
		
		return null ;
	}
	public abstract void getInformation();

}
