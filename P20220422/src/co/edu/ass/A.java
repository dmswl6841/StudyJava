package co.edu.ass;

public class A{
	
	//default 접근 제한자
	int a;	// 같은 패키지 내에 있는 클래스에서만 호출 가능
	
	public int b;	// 모든 패키지 및 클래스에서 호출 가능
	
	protected int c;	// 같은 패키지 내에 있는 클래스 및 자식 클래스에서 호출 가능
	
	private int d;	// 속해 있는 클래스에서만 사용 가능
}
