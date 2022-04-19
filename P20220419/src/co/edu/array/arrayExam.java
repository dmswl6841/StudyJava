package co.edu.array;

public class arrayExam {
	public static void main(String[] args) {
		int score = 1;
		int score1= 2;
		
		int[] ary = new int[5];
		int[] ary1 = {1, 2, 3, 4, 5};
//		System.out.println(ary1.length);
		int sum = 0;
		for(int i=0; i<ary1.length; i++) {
			sum += ary1[i];
		}
		System.out.println("총합 :" + sum);
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);	//scores 첫번째 자리
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 +=scores[i];
		}
		System.out.println("총합 : " + sum1);
		double avg = (double) sum1 / 3;
		System.out.println("평균 : " + avg);
		
		
		//최대 최솟값 구하기
		int[] ary2 = {1,2,3,4,5};
		int max = 0;
		int min = ary2[0];
		for (int i=0; i<ary.length; i++) {
			if (max < ary2[i]) {
				max = ary2[i];
			}
			if(min >ary2[i]) {
				min = ary2[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
	}
	
}
