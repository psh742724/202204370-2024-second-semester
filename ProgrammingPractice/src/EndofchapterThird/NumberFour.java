package EndofchapterThird;

import java.util.Scanner;

public class NumberFour {

	public static void main(String[] args) {
		Scanner heat = new Scanner(System.in);
		
		System.out.print("문자 입력: ");
		char type = heat.next().charAt(0);
		
		System.out.print("온도 입력: ");
		double temp = heat.nextDouble();
		
		if (type == 'C' || type == 'c') {
			double a = (9.0 / 5.0) * temp + 32;
			System.out.println(a);
		}
		else if (type == 'F' || type == 'f') {
			double a = (5.0 / 9.0) * (temp - 32);
			System.out.println(a);
		}
		else {
			System.err.print("문자 입력 오류 ");
		}

		heat.close();
	}

}
