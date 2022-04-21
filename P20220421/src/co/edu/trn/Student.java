package co.edu.trn;

public class Student {
//	한 명의 학생 관리 프로그램
//
//	학생 정보 : 학번, 이름, 국어, 수학, 영어
//
//	기본 생성자를 통한 데이터 입력
//	기본 생성자를 통한 인스턴스 만들고, 인스턴스에 데이터 입력
//
//	반복문X
//
//	기능
//	1. 학생의 기본 정보 출력 - 학번, 이름, 국어, 수학, 영어
//	2. 학생 점수의 평균 출력 - 국, 영, 수
	
	//필드
	String stdNo;
	String name;
	int kor;
	int math;
	int eng;
	
	//생성자
	public Student() {
	}
	
	//메소드
	double result() {
		double sum = (double)(kor + math +eng);
		double avg = sum/3;
		return avg;
	}


	void info() {
		
		System.out.println("학번 : "+ stdNo + ", 이름 : "+ name + ", 국어 : "+ kor + ", 수학 : "+ math + ", 영어 : " + eng);
		
	}
	
	
}
