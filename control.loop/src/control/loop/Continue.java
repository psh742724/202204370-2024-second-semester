package control.loop;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("시작 정수 입력: ");
		int a = in.nextInt();
		
		System.out.print("끝 정수 입력: ");
		int c = in.nextInt();
		
		System.out.print("조건에 들어갈 정수 입력: ");
		int b = in.nextInt();
		
		for (int i = a; i <= c; i++) {
			if (i % b == 0) {
				continue; // 조건에 해당하는 부분을 제외하고 반복을 계속하는 명령어
			}
			System.out.print(i + " ");
		}
		
		in.close();
	}

}
