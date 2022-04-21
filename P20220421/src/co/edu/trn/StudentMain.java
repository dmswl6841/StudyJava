package co.edu.trn;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student();
		std.stdNo = "1011";
		std.name = "돔황차";
		std.kor = 95;
		std.math = 85;
		std.eng = 15;
		
		std.info();
		
		System.out.println("평균 점수 : " + std.result());
	}

}
