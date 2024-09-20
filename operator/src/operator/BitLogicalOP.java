package operator;

import java.util.Scanner;

public class BitLogicalOP {

	public static void main(String[] args) {
		Scanner loc = new Scanner(System.in);
		
		System.out.print("두 정수 입력: ");
		int x = loc.nextInt(), y = loc.nextInt();
		
		System.out.format("%x & %8x -> %-8x %n", x, -1, x & -1);
		System.out.format("%x & %8x -> %-8x %n", y, -1, y & -1);
		System.out.format("%x | %-8x -> %-8x %n", x, 0, x | 0);
		System.out.format("%x | %-8x -> %-8x %n", y, 0, y | 0);
		System.out.format("(%x ^ 1) ^ 1 -> %1$-4d %n", x, (x ^ 1) ^ 1);
		System.out.format("(%x ^ 1) ^ 1 -> %1$-4d %n", y, (y ^ 1) ^ 1);
		System.out.format("%1$-8x %1$-4d %n", (~x) + 1);
		System.out.format("%1$-8x %1$-4d %n", (~y) + 1);
	}

}
