package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		/*
		  기본 타입: 변수에 값 자체가 저장됨, 스택 영역(변수이름, 변수) 
		  참조 타입: 변수에 객체의 번지가 저장됨, 스택 영역(변수이름, 번지) / 힙 영역(객체)
		  
		  String name1 = "홍길동";
		  String name2 = "홍길동";
		  String name3 = new String("홍길동");
		  
		  name1 == name2 -> true
		  name1 == name3 -> false 
		  참조하는 객체가 다름
		  
		  boolean result = str1.equals(str2); -> 객체안의 문자열 비교
		*/
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} 	else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} 	else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
