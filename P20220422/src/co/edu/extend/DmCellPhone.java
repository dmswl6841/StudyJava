package co.edu.extend;

public class DmCellPhone extends cellPhone{
	public int channel;
	
	public DmCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb(){
		System.out.println("채널 : " + channel);
		
	}
	void turnOffDmb(){
		System.out.println("채널을 끕니다");
		
	}
	
	@Override	//부모 클래스에서 정의된 매소드를 자식 클래스에서 재정의(전환)
	void powerOn() {
		System.out.println("자식 클래스에서 전원을 켭니다.");
	}
}
