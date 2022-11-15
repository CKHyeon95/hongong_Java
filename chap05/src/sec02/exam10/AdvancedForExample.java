package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// for( 타입 변수 : 배열 ) { 실행문; }
		// 배열에서 가져온 항목을 타입변수에 저장 시킨 후 실행문 반복, 가져올 항목이 없으면 빠져나옴
		
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		
		for(int score : scores ) {
			sum += score;
		}
		/*
		 for(int i=0; i<scores.length; i++) {
		 sum += scores[i]; }
		 인덱스가 필요없는 작업에서는 향상된 for문이 더 간편하게 사용 가능
		 */
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("점수 평균 = " + avg);

	}
}
