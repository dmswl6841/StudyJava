package co.edu.condition;

public class Grade {

	public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			int num = (int) (Math.random() * 6) + 1;	
			
			System.out.println("주사위 눈의 수는 : " + num);

			switch(num) {								//swich 문에서는 case와 break를 같이 써야한다.
				case 1:
					System.out.println("주사위는 1");
					break;
				case 2:
					System.out.println("주사위는 2");
					break;
				case 3:
					System.out.println("주사위는 3");
					break;
				case 4:
					System.out.println("주사위는 4");
					break;
				case 5:
					System.out.println("주사위는 5");
					break;
				default :
					System.out.println("주사위는 6");
					run = false;
					break;
			}
		}
	}

}
