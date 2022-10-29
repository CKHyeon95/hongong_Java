package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		
		char c1 = 'A' + 1; // javaC가 리터럴끼리 연산하고 바이트코드에도 66이 들어가고 저장됨
		char c2 = 'A';
		int c3 = c2 + c1; // 변수가 산술 연산에 포함이 되면 자바 가상 머신이 연산 하므로 int로 저장해야함
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
