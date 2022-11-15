package sec02.exercise;

public class exercise04 {

	public static void main(String[] args) {
		// for문을 이용하여 주어진 배열의 항목에서 최대값을 구하기
		
		int max = 0;
		int[] array = { 0, 5, 3, 8, 2 };
		
		//작성 위치
		
		for(int i=0; i<array.length; i++) {
			if(max <= array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);

	}

}
