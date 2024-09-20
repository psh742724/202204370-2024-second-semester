package ProgrammingPractice;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		Scanner gat = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int g = gat.nextInt();
		
		System.out.printf("%1$o %1$d %1$x", g);

		gat.close();
	}

}
