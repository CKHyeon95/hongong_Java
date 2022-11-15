package sec02.exam02;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores; // 배열 변수 선언
		scores = new int[] { 83, 90, 87 }; // 배열 변수에 배열을 대입
		// 배열 변수를 선언하고 값의 목록을 줄 경우 new연산자와 함께 변수의 타입과 동일한 배열 타입을 주고 객체를 생성해야한다.
		// 이미 선언 된 변수에 값의 목록을 대입하면 컴파일 오류 발생
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		} //for
		System.out.println("총합 : " + sum1); //배열 항목의 총합을 구하고 출력
		
		int sum2 = add(new int[] { 83, 90, 87});
		System.out.println("총합 : " + sum2);
	} // main 메소드
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
		} // add 메소드
	} 


