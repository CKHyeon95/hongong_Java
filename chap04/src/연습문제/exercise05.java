package 연습문제;

public class exercise05 {

	public static void main(String[] args) {
		// 별찍기
		
		for( int i = 1; i <= 5; i++) {
			for( int j = 1; j <= 5; j++ ) {
				if(i >= j) {
					System.out.print("*");
				} // if
			} // for
			System.out.println("");
		} // for

	} // main

}
