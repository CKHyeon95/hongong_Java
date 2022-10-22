package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		String str1 = "10";
		int value1 = Integer.parseInt(str1);
		System.out.println(value1);
		
		int value2 = Integer.parseInt("30");
		System.out.println(value2);
		
		double value3 = Double.parseDouble("3.14");
		System.out.println(value3);
		
		boolean value4 = Boolean.parseBoolean("true");
		System.out.println(value4);
		
		String str11 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println(str11);
		System.out.println(str2);
		System.out.println(str3);

	}

}
