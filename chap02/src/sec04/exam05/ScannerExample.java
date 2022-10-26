package sec04.exam05;

import java.util.Scanner; //import, new 6장에서 다시 설명

public class ScannerExample {

	public static void main(String[] args) {
		/*
		
		
		  System.in.read()의 단점
		   2개 이상 키가 조합된 한글을 읽을 수 없음
		   키보드로 입력된 내용을 통문자열로 읽을 수 없음 
		   
		  기본 타입의 값 비교와 문자열 비교
		   기본타입의 값 비교는 == 를 사용 
		    int x = 5;
		    boolean result = (x == 5); --> true 
		   문자열의 비교는 equals()메소드 사용
		    boolean result = inputData.equals("비교문자열");
		    String str1 = "java";
		    boolean result1 = str. str1.equals("java"); --> true
		    boolean result1 = str. str1.equals("Java"); --> false (Java는 대소문자를 구분하므로)
		 
		*/

		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"" );
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
		
	}

}

