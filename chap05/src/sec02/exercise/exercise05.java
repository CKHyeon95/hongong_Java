package sec02.exercise;

public class exercise05 {

	public static void main(String[] args) {
		// 주어진 배열의 전체 항목의 합과 평균값 구하기
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		//작성 위치
		int num = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j]; 
				num += 1;
			}
		}
		avg = (double)sum / num;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
