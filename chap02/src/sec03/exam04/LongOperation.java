package sec03.exam04;

public class LongOperation {

	public static void main(String[] args) {
		
		// byte, char, short, int 타입으로 저장된 정수의 연산은 int로 변환되지만 long이 있으면 long으로 변환됨
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long result = value1 + value2 + value3;
		System.out.println(result);

	}

}
