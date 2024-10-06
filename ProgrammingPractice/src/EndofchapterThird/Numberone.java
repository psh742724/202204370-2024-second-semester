package EndofchapterThird;

import java.util.Scanner;

public class Numberone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 정수: int, %d  실수: double, %f
		
		System.out.print("두 실수 입력: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		double sum = x + y;
		double avg = (x + y) / 2;
		
		System.out.printf("합은 %f이고, 평균은 %f \n", sum, avg);
		
		in.close();

	}

}
