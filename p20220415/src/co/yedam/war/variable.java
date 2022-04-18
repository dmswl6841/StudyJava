package co.yedam.war;

public class variable {

	public static void main(String[] args) {
		int age, age1, age2, age3;
//		System.out.println(age2);
		
		int hight = 200;
		
//		int speed;
//		int time;
		int speed, time;
		speed = 10;
		time = 20;
		System.out.println("자전거는 몇 m를 갔을까?");
		System.out.println("시간은"+" "+time+"초");
		System.out.println("속력은"+" "+speed+"m/s");
		System.out.println("시간 * 속력 = 거리");
		System.out.println(time*speed);
		
		//변수 1개 선언, 데이터 X
		int a;
		//변수 1개 선언 후 데이터 따로 담기
		int date;
		date = 0145;
		//변서 1개 선언, 데이터 O
		int b = 500;
		//변수 다수 선언
		int c, d, e;
		c = 10;
		d = 20;
		e = 15;
		//변수 다수 선언 후 데이터 바로 입력
		int f = 25, g = 30, h = 5;
		//변수 초기화 : 최초의 변수 값을 저장할 때
		
		
		int v1 = 0;
		if (true) {				//if 함수 못 읽겠다..
			int v2 = 0;
			if (true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
			}
		//v1 = v2 + v3;		//중괄호를 벗어나서 v3는 변수X
		}
		System.out.println(v1);

	}

}
