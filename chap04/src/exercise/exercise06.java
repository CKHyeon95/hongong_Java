package exercise;

public class exercise06 {

	public static void main(String[] args) {
		// 별찍기2
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 4; j >= 1; j--) {
				if(i <= j) {
					System.out.print(" ");
				} // if
			} // for
			for(int k = 5; k >= 1; k--) {
				if(i >= k) {
					System.out.print("*");
				} // if
			} // for
			System.out.println("");
		} // for
	} // main

} // class
