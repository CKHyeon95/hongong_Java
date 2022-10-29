package sec02.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		/*
		 논리 부정 연산자 [!] 읽을 때는 not으로 읽음 
		 true를 false로, false를 true로 변경
		 조건문과 제어문에서 조건식 값 부정하여 실행 흐름 제어
		*/
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);

	}

}
