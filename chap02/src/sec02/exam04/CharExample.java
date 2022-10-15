package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A'; // ''와 "" 혼동 조심 ""은 문자열, 문자열은 char타입에 저장할 수 없음
        char c2 = 65;
        char c3= '\u0041';
        		
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

	
	}

}
