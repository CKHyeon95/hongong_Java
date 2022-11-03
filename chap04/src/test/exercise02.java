package test;

public class exercise02 {

	public static void main(String[] args) {
		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하라.
		int sum = 0;		
		for( int i=1; i<=100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
		int sum2 = 0;		
		for( int j=1; j<=100; j++) {
			if(j % 3 == 0) {
				sum2 += j;
			}
		}
		System.out.println(sum2);
	} //main

} //class
