package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		mathScores[1][2] = 30;
		
		for(int i=0; i<2; i++) {
			for(int k=0; k<3; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores [0] = new int[2];
		englishScores [1] = new int[3];
		for(int i=0; i<2; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			} // length자리에 3을 넣으면 ArrayIndexOutOfBoundsException이 발생한다.
			  // 계단식 다차원 배열이므로 i의 2번째 인덱스가 없기 때문
		}
		
		System.out.println();
		//                         1곱           2곱
		int[][] javaScores = { {95, 80, 90}, {92, 96, 80} };
		//                      1행 2행 3행   1행 2행 3행
		for(int i=0; i<2; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}
	}

}
