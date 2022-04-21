package co.edu.oop;

public class CarExample {

	public static void main(String[] args) {
		
		MyCar myCar = new MyCar();
		
		myCar.setGas(5);
		
		boolean gasStatus = myCar.isLeftGas();
		if(gasStatus) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if (myCar.isLeftGas ()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요.");
		}
	}
	

}
