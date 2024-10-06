package EndofchapterThird;

import java.util.Scanner;

public class NumberNine {

	public static void main(String[] args) {
		Scanner put = new Scanner(System.in);
		
		System.out.print("키와 몸무게 입력: ");
		double ht = put.nextDouble();
		double wt = put.nextDouble();
		
		double criteria = (ht - 100) * 0.9;
		
		if (wt <= criteria) {
			System.out.println("정상");
		}
		else {
			System.out.println("비만");
		}
		
		put.close();
	}

}
