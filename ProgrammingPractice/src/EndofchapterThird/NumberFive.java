package EndofchapterThird;

import java.util.Scanner;

public class NumberFive {

	public static void main(String[] args) {
		Scanner cent = new Scanner(System.in);
		
		System.out.print("연도 입력: ");
		int year = cent.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 == 0) {
				System.out.println("이 해는 윤년이다.");
			}
			else if (year % 100 == 0 || year % 400 == 0) {
				System.out.println("이 해는 평년이다.");
			}
			else {
				System.out.println("이 해는 윤년이다.");
			}
			
		}
		
		else {
			System.out.println("이 해는 평년이다.");
		}
		
		cent.close();
	}

}
