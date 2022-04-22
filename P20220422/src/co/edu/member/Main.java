package co.edu.member;

public class Main {
	public static void main(String[] args) {
		double pi = StaticMember.PI;
		System.out.println(pi);
		
		int sum = StaticMember.minus(10,5);
		System.out.println(sum);
		
		int minus = StaticMember.minus(10,5);
		System.out.println(minus);
		
		Pizza p1 = new Pizza("cheese");
		Pizza p2 = new Pizza("sweet potato");
		Pizza p3 = new Pizza("bulgogi");
		
		int sale = Pizza.count;
		System.out.println("판매된 피자 개수 : "+sale);
		
		Singleton obj1  = Singleton.getInstace();		//정적 클래스명.메소드
		Singleton obj2  = Singleton.getInstace();
		
		if(p1==p2) {
			System.out.println("같은 피자입니다.");
		}
		
		if(obj1==obj2) {
			System.out.println("하나의 싱글톤 객체입니다.");
		}
		
		System.out.println(obj1);	// 인스턴스화?
		System.out.println(obj2);
	
		
		Person p4 = new Person("981211-2106840","감자");
		
		System.out.println(p4.nation+", " + p4.ssn +", " + p4.name);
		
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA);
	}
	
}
