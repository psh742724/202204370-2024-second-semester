package operator;

import java.util.Scanner;

public class BasicOP {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		int point = cs.nextInt();
		String str = (point % 2 == 0) ? "짝수" : "홀수" ;
		System.out.printf("%d은 %s다. %n", point, str);
		
		double x = cs.nextDouble(), y = cs.nextDouble();
		double max = (x > y) ? x : y ;
		System.out.printf("%f와 %f 중에서 %f가 더 크다.", x, y, max);
		
	}

}
 