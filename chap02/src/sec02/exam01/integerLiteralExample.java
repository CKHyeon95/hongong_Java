package sec02.exam01;

public class integerLiteralExample {

	public static void main(String[] args) {
		
	/* 
	    1byte = 8bit	 
		변수(variable) 하나의 값을 저장하기 위한공간.(변경 가능)
		상수(constant) 값을 한번만 저장할 수 있는 공간.(변경 불가능)
		리터럴(literal) 그 자체로 값을 의미하는 것.
		
		int year = 2022;
		final int value = 100; 
		
		int 변수타입
		year 변수
		2014 리터럴
		Max_value 상수
		100 리터럴
	*/
		
		int var1 = 0b1011; //2진수: 0b 또는 0B로 시작 
		int var2 = 013; // 8진수: 0으로 시작하면 8진수
		int var3 = 11;
		int var4 = 0xb3; //16진수: 0x 또는 0X로 시작하며 0~9 a~f 로 구성
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		

	}

}
