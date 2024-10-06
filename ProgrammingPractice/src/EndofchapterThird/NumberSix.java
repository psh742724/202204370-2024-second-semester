package EndofchapterThird;

import java.util.Scanner;

public class NumberSix {

	public static void main(String[] args) {
		Scanner mil = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = mil.nextInt();
		
		int teng = num / 10000;
		int g = (num / 1000) - (teng * 10);
		int h = (num / 100) - (teng * 100) - (g * 10);
		int t = (num / 10) - (teng * 1000) - (g * 100) - (h * 10);
		int o = num - (teng * 10000) - (g * 1000) - (h * 100) - (t * 10);
		
		System.out.printf("%d만 %d천 %d백 %d십 %d입니다.", teng, g, h, t, o);
		
		mil.close();
	}

}
