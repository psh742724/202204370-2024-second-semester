package array.basic;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int[] month;
		double[] values;
		
		month = new int[4];
		values = new double[3];
		System.out.println(month.length);
		System.out.println(values.length);
		
		
		
		char[] ch = new char[6];
		float[] data = new float[5];
		
		data = new float[7]; // new float[5]의 값을 대체
		
		System.out.println(ch.length);
		System.out.println(data.length);
	}

}
