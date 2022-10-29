package sec02.exam01;

public class signOperatorExample {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
		int result3 = -b; // int 이하 정수의 산술연산은 int연산이 되므로 byte에 저장하면 컴파일 에러 발생
		System.out.println(result3); 

	}

}
