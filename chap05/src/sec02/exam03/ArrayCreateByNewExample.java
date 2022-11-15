package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// 배열을 처음 생성할 때 저장된 길이와 타입은 변경이 불가능하다.
		
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		} // for
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		} // for
		
		System.out.println("-------------------------------------");
		
		double[] arr2 = new double[3];
		for(int j=0; j<3; j++) {
			System.out.println("arr2[" + j + "] : " + arr2[j]);
		} // for
		
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		for(int j=0; j<3; j++) {
			System.out.println("arr2[" + j + "] : " + arr2[j]);
		} // for
		
		System.out.println("-------------------------------------");
		
		String [] arr3 = new String[3];
		for(int j=0; j<3; j++) {
			System.out.println("arr3[" + j + "] : " + arr3[j]);
		} // for
		
		arr3[0] = "a";
		arr3[1] = "b";
		arr3[2] = "b";
		for(int j=0; j<3; j++) {
			System.out.println("arr3[" + j + "] : " + arr3[j]);
		} // for
		

	}

}
