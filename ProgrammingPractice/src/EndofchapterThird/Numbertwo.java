package EndofchapterThird;

import java.util.Scanner;

public class Numbertwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 정수: int, %d  실수: double, %f
		
		System.out.print("두 실수 입력: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		double sum = (int) (x + y);
		double avg = (int) ((x + y) / 2);
		
		System.out.printf("합은 %f이고, 평균은 %f \n", sum, avg);
		
		in.close();

	}

}
