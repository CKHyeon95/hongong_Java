package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		/*
		break문: for, while, do-while, switch문의 실행을 중지할 때 사용, 주로 if문과 함께 사용
		반복문이 중첩되어 있을 경우 Label을 이용하여 바깥 반복문을 빠져나갈 수 있다 
		*/
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
