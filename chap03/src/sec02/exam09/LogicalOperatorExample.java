package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자입니다.");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자입니다.");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자 입니다.");
		}
			
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 입니다.");
		}
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 입니다.");
		}
		
		
		/*
		 & 연산자와 && 연산자의 차이 
		논리곱은 피연산자가 전부 true일 때만 true값을 산출한다.
		&& 연산자는 첫 피연산자가 false일 때 뒤에 피연산자는 계산도 하지 않고 바로 false를 산출한다 -> 속도적 이점을 가짐
		*/

	}

}
