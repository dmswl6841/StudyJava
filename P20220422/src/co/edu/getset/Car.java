package co.edu.getset;

public class Car {
	
	private String campany;
	private String model;
	private String color;
	private int speed;
	
	public String getCampany() {	//데이터를 호출 할떼 get
		return campany;
	}

	public void setCampany(String campany) {	//데이터를 넣을때 set
		this.campany = campany;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		//속도 mile (미국단위) -> km
		return speed*2;
		
	}

	public void setSpeed(int speed) {
		if (speed<0) {
			speed = 0;
		}
		this.speed = speed;
	}
}
