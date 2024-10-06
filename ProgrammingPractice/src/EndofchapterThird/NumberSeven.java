package EndofchapterThird;

import java.util.Scanner;

public class NumberSeven {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("달 입력하기: ");
		
		int month = a.nextInt();
		
		if (month <= 6) {
			System.out.println("상반기입니다.");
		}
		else if (month > 6 && month <= 12) {
			System.out.println("하반기입니다.");
		}
		else {
			System.err.println("달 입력 오류 - 범위 밖");
		}
		
		a.close();
	}

}
