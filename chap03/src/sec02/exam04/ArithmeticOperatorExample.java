package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		/*
		산술 연산자 [ +, -, *, /, % ]
		 피연산자가 byte, short, char 타입일 경우 모두 int타입으로 변환
		 피연산자가 모두 정수 타입이고 long 타입 포함될 경우 모두 long타입으로 변환
		 피연산자 중 실수 타입이 있을 경우 허용 범위가 큰 실수 타입으로 변환  
		*/
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println(result1);
		
		int result2 = v1 - v2;
		System.out.println(result2);
		
		int result3 = v1 * v2;
		System.out.println(result3);

		int result4 = v1 / v2;
		System.out.println(result4);

		int result5 = v1 % v2;
		System.out.println(result5);
		
		double result6 = (double) v1 / v2;
		System.out.println(result6);


	}

}
