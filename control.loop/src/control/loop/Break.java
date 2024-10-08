package control.loop;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("시작 정수 입력: ");
		int a = in.nextInt();
		
		System.out.print("끝 정수 입력: ");
		int c = in.nextInt();
		
		System.out.print("반복을 중단할 정수 입력: ");
		int b = in.nextInt();
		
		for (int i = a; i <= c; i++) {
			System.out.print(i + " ");
			
			if (i == b) { // i가 b가 될 때, b까지 출력 후 반복문 종료
				break;
			}
		}
		
		in.close();

	}

}
