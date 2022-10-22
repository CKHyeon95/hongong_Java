package sec03.exam03;

public class ByteOperation {

	public static void main(String[] args) {

		byte x = 10;
		byte y = 20;
		int result = x + y; // byte, char, short 타입 변수는 int 타입으로 자동 변환됨

		byte x2 = 30;
		long y2 = 40;
		long result2 = x2 + y2;

		byte result3 = 10 + 20; // 컴파일러가 연산을 수행할 때는 타입이 정해지지 않았기 때문에 byte타입에 저장 가능

	}

}
