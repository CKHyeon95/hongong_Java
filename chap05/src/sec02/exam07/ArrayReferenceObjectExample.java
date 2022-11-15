package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		/* 
		 참조 타입의 배열을 만들면 값을 저장하지 않고 객체의 번지를 저장함
		 자바는 문자 리터럴이 같으면 string객체를 공유한다(= 인덱스에 저장된 번지가 같다)
		*/
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
