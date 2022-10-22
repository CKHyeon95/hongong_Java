package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		//강제변환(=casting)
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println("charValue: " + charValue);
		
		long longValue = 500L;
		intValue =(int) longValue;
		System.out.println("intValue: " + intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue: " + intValue); // 실수타입에서 정수타입으로 변환했기 때문에 실수부분은 삭제됨
		
	}

}
