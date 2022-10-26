package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		/* 
		 
		 printf("형식문자열", 값1, 값2, ...)
		 
		 %[argument_index$] [flags] [width] [.precision] [conversion]
		      값의 순번         -,0   전체자릿수    소수자리수      변환문자
		   
		  변환문자: d(정수), f(실술), s(문자열)
		  
		 */
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이:%2$10.2f\n", 10, area);
		
		String name= "홍길동";
		String job = "도적";
		System.out.printf("%d | %9s | %-9s", 1, name, job);

		
	}

}
