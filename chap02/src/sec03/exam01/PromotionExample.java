package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		// 기본 타입의 허용 범위 순: byte < short < int < long < float < double
		 
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue); // 궁금증: 메모리를 아끼기 위해 모든 변수를 byte로 설정하고 if문으로 byte의 범위를 넘는 값만 int로 처리 하면 안 되나?
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue: " + intValue);
		
		intValue = 30;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

	}

}
