package com.yedam.java.Question3;

public abstract class Movie extends Culture{
	
//	2) Movie 클래스를 정의한다.
//	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	
	
	
	//필드
	String genre;

	//생성자
	public Movie() {
	}
	public Movie(String genre) {
		this.genre = genre;
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("제목 : " + name + "\n참여 감독 수 : " + directorNum + "\n참여 배우 수 : "+ actNum + "/n관객 수 "+ audience + "\n총점" +  );
	}
	
	
}
