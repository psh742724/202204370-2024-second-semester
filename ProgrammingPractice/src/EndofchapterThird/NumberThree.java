package EndofchapterThird;

import java.util.Scanner;

public class NumberThree {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("무게 입력: ");
		double kg = key.nextDouble();
		
		double lb = kg / 0.453592;
		
		System.out.printf("최종 파운드: %.3f \n", lb);

		key.close();
	}

}
