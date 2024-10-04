package operator;

public class TypeCast {

	public static void main(String[] args) {
		byte bt = (byte) -129;
		System.out.format("%d의 이진수: %s %n", -129, Integer.toBinaryString(-129));
		System.out.format("%d의 이진수: %s %n", bt, Integer.toBinaryString(bt));
		
		// int n = 5.0 / 4.0; // 반드시 (자료형 == 선언한 변수와 같은 자료형)을 첨가해야 함.
		int n = (int) (5.0 / 4.0);
		System.out.println(n);
		System.out.println(3 / 4);
		System.out.println(3 / 4.0);
		
		double d = 3 + 4 * 2;
		System.out.println(d);
	}

}
