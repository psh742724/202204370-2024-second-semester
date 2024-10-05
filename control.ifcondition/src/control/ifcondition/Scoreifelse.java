package control.ifcondition;

import java.util.Scanner;

public class Scoreifelse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int score = in.nextInt();
		
		if (60 <= score) {
			System.out.println("합격입니다.");
		}

		else {
			System.out.println("불합격입니다.");
		}
		
		in.close();
	}

}
