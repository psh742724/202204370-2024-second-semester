package operator;

import java.util.Scanner;

public class IncDecOP {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		
		System.out.print("감소값 및 증가값: ");
		
		int m = g.nextInt(), n = g.nextInt();
		
		System.out.printf("%d %d %n", m--, n++); // 이후 출력에서 결과 표시
		System.out.printf("%d %d %n", m, n);
		System.out.printf("%d %d %n", --m, ++n); // 해당 출력에서 바로 결과 표시
		System.out.printf("%d %d %n", m, n);

	}

}
