package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score< 90) 
			System.out.println("점수가 90점 미만입니다.");
			System.out.println("등급은 B 입니다."); 
			// if문에서 실행식이 한줄이면 {}를 안 해도 되지만 깔끔한 코드 작성을 위해 {}를 빼먹지 말자
		
	}

}
