package sec02.exam03;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		//이전 예제에서 i변수를 출력하고 싶을 때
		
		int sum = 0;
		int i = 1; // for문 안에서 선언된 변수는 for문에서만 사용 가능하므로 메인블록에서 i를 선언해야한다
		
		for(i=1; i<=100; i++) {
			sum += i; 
		}
		
		System.out.println("1~" + (i-1) + "합: " + sum); 
		// for문에서 i는 100까지 수행하고 101에서 false가 되어 빠져나온다

	}

}
