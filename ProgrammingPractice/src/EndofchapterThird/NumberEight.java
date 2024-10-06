package EndofchapterThird;

import java.util.Scanner;

public class NumberEight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("세 수를 입력: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a > b && a > c) {
			System.out.printf("가장 큰 수: %d%n", a);
		}
		
		else if (b > a && b > c) {
			System.out.printf("가장 큰 수: %d%n", b);
		}
		
		else if (c > a && c > b) {
			System.out.printf("가장 큰 수: %d%n", c);
		}
		
		else {
			System.out.println("가장 큰 수가 판별되지 않음.");
		}
		
		in.close();
	}

}
