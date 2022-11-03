package sec02.exam07;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		int sum1 = 0;
		int i = 1;
		
		while (i<=100) {
			sum1 = i + sum1;
			++i;
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		int j = 1;
		
		do {
			sum2 = j + sum2;
			++j;
		}	while (j<=100);
		System.out.println(sum2);
		
	}

}
