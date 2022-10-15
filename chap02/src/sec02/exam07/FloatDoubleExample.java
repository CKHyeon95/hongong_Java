package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		float var1 = 3.14f;  //자바는 실수 리터럴을 기본적으로 double타입으로 해석하기 때문에 float타입으로 저장하려면 리터럴 뒤에 f를 붙여야함
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		float var3 = 0.1234567890123456789f; //var 타입은 소수점 이하자리 약 7번 째 까지 표현 가능
		double var4 = 0.1234567890123456789; // double타입은 소수점 이하자리 15~18까지 가능
		
		System.out.println(var3);
		System.out.println(var4);
		
		double var5 = 3e6;
		float var6 = 3e6f; // e는 실수이므로 리터럴 뒤에 f를 붙여야함
		double var7 = 2e-3;
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);

	}

}
