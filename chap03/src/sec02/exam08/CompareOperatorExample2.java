package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
	    System.out.println((double)v5);
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println((int)(4*10) == (int)(v5*10));
		
		double aa = 0.1;
		double bb = 0.2;
		System.out.println(aa * bb);
		
		// float 타입과 double 타입은 가급적 비교 하지 않기, 부동소수 개념 찾아보기

	}

}
