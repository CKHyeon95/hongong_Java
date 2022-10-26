package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		
		//키코드: 키보드에서 키를 입력할 때 프로그램에서 숫자로 된 키코드를 읽음, 얻은 키코드는 대입 연산자를 사용하여 int변수에 저장
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		// a의 키코드 값은 97 Enter키의 키코드 값은 13,10 이기 때문에 반복하면 차례로 값이 뜸
		
	}

}

