package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// System.arraycopy( 원본배열, 인덱스, 새배열, 인덱스, 길이 )
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
			
		}
	}

}
