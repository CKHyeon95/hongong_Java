package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int num = scores.length;
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += scores[i];
		} // for문 조건식에서 '<=' 연산자를 사용하면 length는 3인데 인덱스는 2이므로 ArrayIndexOutOfBoundsException이 발생한다.
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / num;
		System.out.println("평균 : " + avg);
	}
}
