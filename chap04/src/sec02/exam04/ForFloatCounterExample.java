package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {

		for(float x=0.1f; x<=1.0f ;x+=0.1f) {
			System.out.println(x);
		}
		
		//부동소수에 의하여 정확히 0.1씩 오르지 않으므로 원하는 값을 얻지 못했음
		//이러한 이유로 반복문에서는 정수타입만 사용한다

	}

}
