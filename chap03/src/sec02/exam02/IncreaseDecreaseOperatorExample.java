package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		
		/*
		  증감 연산자: boolean타입 외 모든 기본 타입 피연산자에 사용 가능
		  i++ / ++i 변수의 앞뒤 어디에든 올 수 있으며 결과 값이 같다
		  다른 연산자와 함께 사용될 경우 증감 연산자의 위치에 따라 결과값이 변함
		*/
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++;
		++x; //12
		System.out.println("x=" + x);
		
		System.out.println("----------------------");
		y--;
		--y;// 8
		System.out.println("y=" + y);
		
		System.out.println("----------------------");
		z= x++; // 다른 연산자(대입 연산자)와 함께 사용 됨 -> x를 z에 저장한 후 증가
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------------");
		z= ++x + y++; // 15+8->23이 z에 저장 된 후 y는 9로 증가 됨
		System.out.println("z=" + z);
		System.out.println("x=" + x);	
		System.out.println("y=" + y);
		/*
		위 식은 간결하지만 틀리기 쉬우므로 가독성을 높은 코드를 사용하는 것이 낫다
		++x;
		z = x + y;
		y++;
		*/

	}

}
