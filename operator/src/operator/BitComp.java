package operator;

import java.util.Scanner;

public class BitComp {

	public static void main(String[] args) {
		Scanner cj = new Scanner(System.in);
		Scanner gat = new Scanner(System.in);
		
		System.out.print("x 입력: ");
		int x = cj.nextInt();
		int y = 0xffff_ffff;
		
		System.out.format("%d의 이진수: %s %n", y, Integer.toBinaryString(y));
		System.out.println(x &= y);
		System.out.println(x);

		System.out.print("키 입력: ");
		
		int key = gat.nextInt();
		
		System.out.println(x ^= key);
		System.out.println(x ^= key);
		
		cj.close();
		gat.close();
	}

}
