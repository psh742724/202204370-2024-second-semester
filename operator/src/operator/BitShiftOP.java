package operator;

import java.util.Scanner;

public class BitShiftOP {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		
		System.out.print("x의 값: ");
		int x = r.nextInt(), y = 3;
		
		
		System.out.format("%d(%s) >> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x), y, x >> 3, Integer.toBinaryString(x >> 3));
		System.out.format("%d(%s) << %d 결과 %d(%s) %n", x, Integer.toBinaryString(x), y, x << 3, Integer.toBinaryString(x << 3));
		System.out.format("%d(%s) >>> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x), y, x >>> 3, Integer.toBinaryString(x >>> 3));

	}

}
