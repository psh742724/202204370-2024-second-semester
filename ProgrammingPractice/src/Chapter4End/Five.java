package Chapter4End;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner buck = new Scanner(System.in);
		
		System.out.print("금액 입력: ");
		int m = buck.nextInt();
		
		for(int y = 1 ; y <= 10 ; y++) { // 1년에서 10년까지
			System.out.println(y + "년 후 : " + m * (1 + 0.045 * y) + "원");
		}

		buck.close();
	}

}
