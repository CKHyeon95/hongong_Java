package sec02.exam11;

public class ConditionlOperationExample {

	public static void main(String[] args) {
		/*   삼항 연산자 
		    A(조건식) ? B : C -> 조건식 A가 true이면 B값 산출 false이면 C값 산출 
		*/
		
		int score =85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
