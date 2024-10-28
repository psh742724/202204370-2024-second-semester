package Chapter4End;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("정수 입력: ");
		int n = input.nextInt();
		
		do {
			System.out.print(n %10); // 일의 자리 출력
			n /= 10; // 새로운 수 담기(일의 자리 제외)
		}
		while(n != 0);
		
		input.close();

	}

}
