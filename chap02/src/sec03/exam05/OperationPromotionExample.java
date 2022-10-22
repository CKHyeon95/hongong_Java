package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 +byteValue2 정수 연산의 결과는 int타입으로 저장되기 때문에 컴파일 에러 발생
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2 마찬가지로 int타입으로 저장되기 때문에 컴파일 에러 발생
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue2); // 유니코드로 저장되어 연산하므로 유니코드 값이 나옴
		System.out.println("출력문자: " + (char)intValue2); //문자로 나타내고 싶으면 유니코드를 다시 char타입으로 강제 변환
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; 
		double doubleValue1 = intValue3 / 4;
		double doubleValue2 = (double) intValue3 / 4;
		double doubleValue3 = intValue3 / 4.0;
		double doubleValue4 = (double)intValue3 /  4.0;
		System.out.println(intValue4); 
		System.out.println(doubleValue1); 
		System.out.println(doubleValue2);
		System.out.println(doubleValue3);
		System.out.println(doubleValue4);
		// 정수의 연산은 정수로 출력되므로 실수타입으로 변환해야한다

	}

}
