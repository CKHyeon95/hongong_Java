package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		//반복문을 빠져나갈 때 => break , 반복문의 처음으로 돌아갈 때 => continue
		
		for( int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
